package com.apollo.discussions;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;

public class MySampleLayout extends LayoutBase<ILoggingEvent> {

  public String doLayout(ILoggingEvent event) {
    StringBuffer sbuf = new StringBuffer(1228);
    sbuf.append(event.getTimeStamp() - event.getLoggerContextVO().getBirthTime());
    sbuf.append(" ");
    sbuf.append(event.getLevel());
    sbuf.append(" [");
    sbuf.append(event.getThreadName());
    sbuf.append("] ");
    sbuf.append(event.getLoggerName());
//    System.out.println("--------->"+event.getLoggerName());
    sbuf.append(" - ");
    sbuf.append(event.getFormattedMessage());
//    System.out.println("-------->"+event.getFormattedMessage());
    sbuf.append(CoreConstants.LINE_SEPARATOR);
    return sbuf.toString();
  }
}