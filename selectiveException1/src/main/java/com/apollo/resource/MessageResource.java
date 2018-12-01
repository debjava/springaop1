package com.apollo.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.apollo.service.MessageService;

public class MessageResource {
	
//	protected static Logger log = LoggerFactory.getLogger("discussions_exceptions");
	protected static Logger log = LoggerFactory.getLogger(MessageResource.class);

	@Autowired
	private MessageService msgService;
	/*private MessageService msgService = new MessageService();*/

	public void getDiscussionMessage() {
		validateMessage();
	}

	private void validateMessage() {
		retreiveMessage();
	}

	private void retreiveMessage() {
		try {
			msgService.getBaseMessage();
		} catch (Exception e) {
			log.error("Some Exception----->",e);
			throw new RuntimeException("Exception at ", e);
//			throw new RuntimeException("Exception at ", e);
		}
	}

	public MessageService getMsgService() {
		return msgService;
	}

	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
}
