package com.apollo.discussions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apollo.resource.MessageResource;

public class Test {
	
//	private static final Logger log = LoggerFactory.getLogger("discussions_exceptions");
	private static final Logger log = LoggerFactory.getLogger(Test.class);
			
	public static void main(String[] args) throws IOException, InterruptedException {
//		 LogWriter logWriter = new LogWriter();
//	        logWriter.start();
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			MessageResource msgResource = (MessageResource) context.getBean("messageResource");
//			MessageResource msgResource = new MessageResource();
			msgResource.getDiscussionMessage();
		} catch (Exception e) {
			 log.error("Error at ...", e);
			 List<StackTraceElement> stsList = new ArrayList<StackTraceElement>();
			 
			 StackTraceElement[] sts = e.getStackTrace();
			 for( StackTraceElement st : sts ) {
				 System.out.println("----->"+st.getClassName());
				 stsList.add(st);
			 }
			 
			 
			 
		}
//		logWriter.shutdown();
//                System.in.read();
//                Thread.sleep(15000);
	}
}
