package com.apollo.repository;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


/*
 * Sample Repository Layer for Discussion POC
 */
public class RepositoryHibernate {
	
//	protected static final Logger log = LoggerFactory.getLogger("discussions_exceptions");
	protected static final Logger log = LoggerFactory.getLogger(RepositoryHibernate.class);
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void getMessage() {
		getMessageFromDB();
	}

	private void getMessageFromDB() throws RuntimeException {
		getMessageRepositorySpecific();
	}

	@Transactional
	public void getMessageRepositorySpecific() {
		int personList = 0;
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			personList = session.createQuery("from APerson").list().size();
		} catch (Exception e) {
			log.error("HibernateException .....\n",e);
			throw new HibernateException("Real Root Exception while getting the message using hibernate query.",e);
//			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		
		
//		try {
//			
//			throw new RuntimeException("Real Root Exception while getting the message using hibernate query.");
//		} catch (Exception e) {
//			log.error("----->", e);
//			throw new RuntimeException("Actual Exception is message name space not found.", e);
//		}
	}

}
