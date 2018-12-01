package edu.apollogrp.newpackage2;

import hibernate.or.spring.newpackage3.NewClass3;

/**
 *
 * @author jpingali
 */
public class NewClass2 {
    public void secondLevelStack() {
        NewClass3 newClass3 = new NewClass3();
        newClass3.thirdLevelStack();
    }
}
