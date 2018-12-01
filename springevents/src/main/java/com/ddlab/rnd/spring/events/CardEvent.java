package com.ddlab.rnd.spring.events;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class CardEvent extends ApplicationEvent {

	private static final long serialVersionUID = 5136436079401730585L;
	private Card card;
	private Date currentDate;
	private String operation;

    public CardEvent(Card card) {
        super(card);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
    
}
