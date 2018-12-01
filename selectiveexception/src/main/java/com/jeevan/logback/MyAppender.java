package com.jeevan.logback;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.AppenderBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author jpingali
 */
public class MyAppender extends AppenderBase<Object> {

    static Queue<DiscussionLog> queue = new ArrayBlockingQueue<>(2000);
    private String packageNames;
    private List<String> packages = new ArrayList<>();

    public void setPackageNames(String packageNames) {
//    	System.out.println("------set---------Package Names: " + packageNames);
        this.packageNames = packageNames;
        StringTokenizer st = new StringTokenizer(packageNames, ",");
        while(st.hasMoreTokens()) {
            packages.add(st.nextToken().trim());
        }
    }

    public String getPackageNames() {
        return packageNames;
    }
    
    @Override
    protected void append(Object e) {
        System.out.println("---------------Package Names: " + packageNames);
        LoggingEvent event = (LoggingEvent) e;
        DiscussionLog log = new DiscussionLog(event.getLevel(), event.getFormattedMessage());
        IThrowableProxy proxy = event.getThrowableProxy();
        if (proxy != null) {
            log.setMessage(log.getMessage() + " - " + proxy.getClassName() + " - " + proxy.getMessage());
            for (StackTraceElementProxy element : proxy.getStackTraceElementProxyArray()) {
                StackTraceElement traceElement = element.getStackTraceElement();
                boolean elementAdded = false;
                for (String packageName : packages) {
                    final String elementString = element.toString();
                    final boolean elementContaineBoolean = elementString.contains(packageName);
                    final boolean theIFCondition = elementContaineBoolean && !elementAdded;
//                	System.out.println("For Loop Package Name :::"+packageName);
                    if(theIFCondition) {
//                    	System.out.println("traceElement--------->"+traceElement);
                        log.addStackTraceElement(traceElement);
                        elementAdded = true; 
                    }
                }
            }
        }
        queue.add(log);
    }

    class DiscussionLog {

        private final Level level;
        private String message;
        private final List<StackTraceElement> elements = new ArrayList<>();

        DiscussionLog(Level level, String message) {
            this.level = level;
            this.message = message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
        
        void addStackTraceElement(StackTraceElement element) {
            elements.add(element);
        }

        public Level getLevel() {
            return level;
        }

        public String getMessage() {
            return message;
        }

        public List<StackTraceElement> getElements() {
        	System.out.println("Element from Discussion :::"+elements);
            return elements;
        }
    }

}
