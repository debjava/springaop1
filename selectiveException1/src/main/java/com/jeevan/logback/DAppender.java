package com.jeevan.logback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.AppenderBase;

public class DAppender extends AppenderBase<ILoggingEvent> {
	
	private String packageNames;
    private List<String> packages = new ArrayList<>();
    
    PatternLayoutEncoder encoder;
    
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
    public void start() {

    	if (this.encoder == null) {
    	      addError("No encoder set for the appender named ["+ name +"].");
    	      return;
    	    }
    	    
    	    try {
    	      encoder.init(System.out);
    	    } catch (IOException e) {
    	    }
    	    super.start();
    }

	@Override
	protected void append(ILoggingEvent arg0) {
		LoggingEvent event = (LoggingEvent) arg0;
//        DiscussionLog log = new DiscussionLog(event.getLevel(), event.getFormattedMessage());
        IThrowableProxy proxy = event.getThrowableProxy();
        List<StackTraceElement> stList = new ArrayList<StackTraceElement>();
        
        if (proxy != null) {
//            log.setMessage(log.getMessage() + " - " + proxy.getClassName() + " - " + proxy.getMessage());
            for (StackTraceElementProxy element : proxy.getStackTraceElementProxyArray()) {
                StackTraceElement traceElement = element.getStackTraceElement();
                boolean elementAdded = false;
                for (String packageName : packages) {
                    final String elementString = element.toString();
                    final boolean elementContaineBoolean = elementString.contains(packageName);
                    final boolean theIFCondition = elementContaineBoolean && !elementAdded;
                	System.out.println("For Loop Package Name :::"+packageName);
                    if(theIFCondition) {
                    	System.out.println("traceElement--------->"+traceElement);
//                        log.addStackTraceElement(traceElement);
                        elementAdded = true; 
                        stList.add(traceElement);
                        
                        StackTraceElement[] elements = new StackTraceElement[stList.size()];
                        event.setCallerData(stList.toArray(elements));
                        try {
                            this.encoder.doEncode(event);
                          } catch (IOException e) {
                          }
                    }
                }
            }//~~~~~~~~~~~~~
//            StackTraceElement[] elements = new StackTraceElement[stList.size()];
//            event.setCallerData(stList.toArray(elements));
        }
        
//        try {
//            this.encoder.doEncode(event);
//          } catch (IOException e) {
//          }
	}
	
	public PatternLayoutEncoder getEncoder() {
	    return encoder;
	  }

	  public void setEncoder(PatternLayoutEncoder encoder) {
	    this.encoder = encoder;
	  }
	

}
