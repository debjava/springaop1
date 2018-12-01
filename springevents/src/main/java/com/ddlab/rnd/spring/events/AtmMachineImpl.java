package com.ddlab.rnd.spring.events;

import java.util.Date;

public class AtmMachineImpl implements AtmMachine {

    private EventPublisher eventPublisher;

    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public void insertCard(Card card) {
        CardEvent event = new CardEvent(card);
        event.setCurrentDate(new Date());
        event.setOperation("Insertion");
        eventPublisher.publishEvent(event);
    }

    @Override
    public int withdrawMoney(Card card,int amount) {
    	 CardEvent event = new CardEvent(card);
    	 event.setCurrentDate(new Date());
    	 event.setOperation("Withdrawl");
         eventPublisher.publishEvent(event);
        return amount;
    }
}
