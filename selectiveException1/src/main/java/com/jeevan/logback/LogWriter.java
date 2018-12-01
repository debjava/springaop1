package com.jeevan.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;

/**
 *
 * @author jpingali
 */
public class LogWriter extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(LogWriter.class);
    private boolean shutdown = false;

    @Override
    public void run() {
        while(shutdown == false){
            if (MyAppender.queue.isEmpty()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            } else {
                printLog();
            }
        }
    }

    public void shutdown() {
        this.shutdown = true;
    }
    
    private void printLog() {
        MyAppender.DiscussionLog log = null;
        while((log = MyAppender.queue.poll()) != null) {
            if(Level.INFO == log.getLevel()) {
                printInfoLog(log);
            } else if(Level.ERROR == log.getLevel()) {
                printErrorLog(log);
            } else if(Level.DEBUG == log.getLevel()) {
                printDebugLog(log);
            }
        }
    }

    private void printInfoLog(MyAppender.DiscussionLog log) {
        logger.info(log.getMessage());
        for (StackTraceElement element : log.getElements()) {
            logger.info("\t at " + element.toString());
        }
    }

    private void printErrorLog(MyAppender.DiscussionLog log) {
        logger.error(log.getMessage());
        for (StackTraceElement element : log.getElements()) {
            logger.error("\t at " + element.toString());
        }
    }

    private void printDebugLog(MyAppender.DiscussionLog log) {
        logger.debug(log.getMessage());
        for (StackTraceElement element : log.getElements()) {
            logger.debug("\t at " + element.toString());
        }
    }
}
