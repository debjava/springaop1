package com.apollo.discussions;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
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
		//	  System.out.println("--------->"+e.getLoggerName());

		LoggingEvent event = (LoggingEvent) e;
		IThrowableProxy proxy = event.getThrowableProxy();
//		System.out.println("event.getThrowableProxy()-------->"+event.getThrowableProxy());
		
		ThrowableProxy tp = null;
//		tp.
		
//		ThrowableProxyUtil.s
		
//		ThrowableProxyUtil.steArrayToStepArray
		
		List<StackTraceElement> list = new ArrayList<StackTraceElement>();
		
		if (proxy != null) {
			for (StackTraceElementProxy element : proxy.getStackTraceElementProxyArray()) {
				boolean checkVal = false;
				StackTraceElement traceElement = element.getStackTraceElement();
				//			  System.out.println(traceElement);
//				System.out.println("All packages:::"+packages);
				for (String packageName : packages) {
//					System.out.println("=======================");
					final String elementString = element.toString();
					System.out.println("------------>"+elementString);
					System.out.println("traceElement=====>"+traceElement.toString());
//					System.out.println("Package Name :::"+packageName);
					final boolean elementContaineBoolean = traceElement.toString().contains(packageName);
					final boolean theIFCondition = elementContaineBoolean ;
//					System.out.println(theIFCondition);
					//              	System.out.println("For Loop Package Name :::"+packageName);
					
					System.out.println("event msg :::"+event.getFormattedMessage());
					
					if(theIFCondition) {
						System.out.println("It should be accepted....");
						
						list.add(traceElement);
						checkVal = true;
						//                	  return FilterReply.ACCEPT;
					}
					else {
						System.out.println("It should be rejected....");
						//                	  return FilterReply.DENY;
//						traceElement = null;
					}
				}
				
				System.out.println("Final 111111111111:::"+list);
				StackTraceElement[] st1 = new StackTraceElement[list.size()];
				StackTraceElement[] st = list.toArray(st1);
				System.out.println("Final 2222222222:::"+st);
				event.setCallerData(st);
				
				
				if( checkVal ) {
					System.out.println("Final :::"+list);
//					System.out.println("=================================");
					return FilterReply.ACCEPT;
				}
				else
				{
					return FilterReply.DENY;
				}
			}
//			https://github.com/logstash/logstash-logback-encoder#custom_stacktrace
			
//			https://github.com/nurkiewicz/logback/tree/LBCLASSIC-325/logback-classic
			
			

		}

//		System.out.println("Final :::"+list);
//		StackTraceElement[] st1 = new StackTraceElement[list.size()];
//		StackTraceElement[] st = list.toArray(st1);
//		System.out.println("Final :::"+st);
//		event.setCallerData(st);
//		System.out.println("Final :::"+st);



		//	  System.out.println("--------->"+event.getMessage());
		//    if (event.getMessage().contains("com.apollo")) {
		//	  if (event.getLoggerName().contains("com.apollo")) {
		//	  if (event.getLoggerName().startsWith("com.apollo")) {
		//      return FilterReply.ACCEPT;
		//    } else {
		//    	return FilterReply.DENY;
		////      return FilterReply.NEUTRAL;
		//    }

//		return FilterReply.ACCEPT;
		return FilterReply.NEUTRAL;
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