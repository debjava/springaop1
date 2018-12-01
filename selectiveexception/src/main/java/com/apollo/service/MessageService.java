package com.apollo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.apollo.repository.RepositoryHibernate;
/*
 * Sample Service Layer for Discussion POC
 */
public class MessageService {

	protected static final Logger log = LoggerFactory.getLogger("discussions_exceptions");
//	protected static final Logger log = LoggerFactory.getLogger(MessageService.class);
	
	@Autowired
	private RepositoryHibernate repoHibernate;
	
//	private final RepositoryHibernate repoHibernate = new RepositoryHibernate();

	public void getBaseMessage() {
		getSuperMessage();
	}

	private void getSuperMessage() {
		getMessages();
	}

	private void getMessages() {
		try {
			repoHibernate.getMessage();
		} catch (Exception e) {
			log.error("Unable to get the message details...",e);
			throw new RuntimeException("Unable to get the required message", e);
		}
	}

	public RepositoryHibernate getRepoHibernate() {
		return repoHibernate;
	}

	public void setRepoHibernate(RepositoryHibernate repoHibernate) {
		this.repoHibernate = repoHibernate;
	}

}
