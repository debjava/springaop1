package com.apollo.discussions;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;

public class SampleTurboFilter extends TurboFilter {

  String marker;
  Marker markerToAccept;

  @Override
  public FilterReply decide(Marker marker, Logger logger, Level level,
      String format, Object[] params, Throwable t) {

    if (!isStarted()) {
      return FilterReply.NEUTRAL;
    }
    
    System.out.println("MarkerToAccept :::::::::::"+markerToAccept);
//    System.out.println("marker :::::::::::"+marker);
//    System.out.println("format--------->"+params);
    
//    for(Object obj : params) {
//    	System.out.println("------>"+obj);
//    }
    
//    t.printStackTrace();
    List<StackTraceElement> list = new ArrayList<StackTraceElement>();
    StackTraceElement[] traceElements = null;
    if(t != null) {
    	traceElements = t.getStackTrace();
        for( StackTraceElement traceElement  : traceElements ) {
        	System.out.println("==========>"+traceElement.toString());
        	
        	if(traceElement.toString().contains("org.springframework")) {
        		
//        		return FilterReply.DENY;
        	}
        	else {
        		list.add(traceElement);
        	}
        }
    }
//    StackTraceElement[] 
//    if ((markerToAccept.equals(marker))) {
//      return FilterReply.ACCEPT;
//    } else {
//      return FilterReply.NEUTRAL;
//    }
    System.out.println("-------"+list);
    StackTraceElement[] st1 = new StackTraceElement[list.size()];
	StackTraceElement[] st = list.toArray(st1);
	t.setStackTrace(st1);
    return FilterReply.ACCEPT;
  }

  public String getMarker() {
    return marker;
  }

  public void setMarker(String markerStr) {
    this.marker = markerStr;
  }

  @Override
  public void start() {
    if (marker != null && marker.trim().length() > 0) {
      markerToAccept = MarkerFactory.getMarker(marker);
      super.start(); 
    }
  }
}