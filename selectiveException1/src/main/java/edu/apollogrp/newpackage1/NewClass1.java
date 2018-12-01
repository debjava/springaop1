package edu.apollogrp.newpackage1;

import edu.apollogrp.newpackage2.NewClass2;

/**
 *
 * @author jpingali
 */
public class NewClass1 {
    public void firstLevelStack() {
        NewClass2 newClass2 = new NewClass2();
        newClass2.secondLevelStack();
    }
}
