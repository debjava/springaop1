package edu.apollogrp.utils.selectivelogging;

import com.jeevan.logback.LogWriter;
import edu.apollogrp.newpackage1.NewClass1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    public static final Logger exceptionLogger = LoggerFactory.getLogger("discussions_exceptions");
    public static void main(String args[]) throws InterruptedException {
        LogWriter logWriter = new LogWriter();
        logWriter.start();
//        exceptionLogger.error("Hi Jeevan, this is a new exception.", new NumberFormatException());
//        exceptionLogger.error("Texceptionhis iexceptions a test");
//        exceptionLogger.info("This is info log");
//        exceptionLogger.info("This is info log two: ", new NullPointerException("This is null dude"));
        NewClass1 newClass1 = new NewClass1();
        try {
            newClass1.firstLevelStack();
        } catch (NumberFormatException e) {
            exceptionLogger.error("Exception is thrown here.", e);
        }
        Thread.sleep(10000);
        logWriter.shutdown();
    }
}
