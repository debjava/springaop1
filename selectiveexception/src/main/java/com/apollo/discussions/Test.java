package com.apollo.discussions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apollo.resource.MessageResource;
import com.jeevan.logback.LogWriter;
import java.io.IOException;

public class Test {
	
	private static final Logger log = LoggerFactory.getLogger("discussions_exceptions");
//	private static final Logger log = LoggerFactory.getLogger(Test.class);
			
	public static void main(String[] args) throws IOException, InterruptedException {
		 LogWriter logWriter = new LogWriter();
	        logWriter.start();
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			MessageResource msgResource = (MessageResource) context.getBean("messageResource");
//			MessageResource msgResource = new MessageResource();
			msgResource.getDiscussionMessage();
		} catch (Exception e) {
//			 log.error("", e);
		}
//		logWriter.shutdown();
                System.in.read();
                Thread.sleep(15000);
	}
}
