package com.apollo.discussions;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class SampleFilter extends Filter<ILoggingEvent> {
	
	 private Level level;
	    private String logger;
	    
	    private String packageNames;
	    private List<String> packages = new ArrayList<>();
	    public void setPackageNames(String packageNames) {
//	    	System.out.println("------set---------Package Names: " + packageNames);
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
  public FilterReply decide(ILoggingEvent e) {    
//	  System.out.println("--------->"+event.getLoggerName());
	  
	  LoggingEvent event = (LoggingEvent) e;
	  IThrowableProxy proxy = event.getThrowableProxy();
	  if (proxy != null) {
		  for (StackTraceElementProxy element : proxy.getStackTraceElementProxyArray()) {
			  StackTraceElement traceElement = element.getStackTraceElement();
			  for (String packageName : packages) {
				  
				  final String elementString = element.toString();
                  final boolean elementContaineBoolean = elementString.contains(packageName);
                  
                  final boolean theIFCondition = elementContaineBoolean ;
//              	System.out.println("For Loop Package Name :::"+packageName);
                  if(theIFCondition) {
                	  return FilterReply.ACCEPT;
                  }
                  else {
                	  return FilterReply.DENY;
                  }
                  }
			  }
		  
		  
	  }
	  
	  
	  
	  
	  
	  
//	  System.out.println("--------->"+event.getMessage());
//    if (event.getMessage().contains("com.apollo")) {
//	  if (event.getLoggerName().contains("com.apollo")) {
//	  if (event.getLoggerName().startsWith("com.apollo")) {
//      return FilterReply.ACCEPT;
//    } else {
//    	return FilterReply.DENY;
////      return FilterReply.NEUTRAL;
//    }
	  
	  return FilterReply.ACCEPT;
  }
  
//  https://github.com/gilt/logback-flume-appender/blob/master/src/main/java/com/gilt/logback/flume/FlumeLogstashV1Appender.java
  
  
  
  
  
  
  public void setLevel(Level level) {
      this.level = level;
  }

  public void setLogger(String logger) {
      this.logger = logger;
  }

  public void start() {
      if (this.level != null && this.logger != null) {
          super.start();
      }
  }
  
  
  
}