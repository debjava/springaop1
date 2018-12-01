package com.ddlab.rnd.spring.events;

import org.springframework.context.ApplicationListener;

public class EventListener implements ApplicationListener<CardEvent> {

    @Override
    public void onApplicationEvent(CardEvent event) {
        System.out.println("Event :::"+event);
        Card card = event.getCard();
        System.out.println("Account No : "+card.getAccountNo());
        System.out.println("Date :::"+event.getCurrentDate());
        System.out.println("Operation :::"+event.getOperation());
    }
}
