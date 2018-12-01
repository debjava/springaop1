package com.ddlab.rnd.spring.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

    public static void main(String[] ags) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Card card = (Card)context.getBean("card");
        AtmMachine atm = (AtmMachine) context.getBean("atmMachine");
        atm.insertCard(card);
        atm.withdrawMoney(card, 1000);
        
    }
}
