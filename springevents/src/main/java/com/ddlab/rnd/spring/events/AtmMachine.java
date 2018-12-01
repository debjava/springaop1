package com.ddlab.rnd.spring.events;

public interface AtmMachine {

    public void insertCard(Card card);

    public int withdrawMoney(Card card,int amount);
}
