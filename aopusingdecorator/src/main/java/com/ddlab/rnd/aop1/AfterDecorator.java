package com.ddlab.rnd.aop1;

public class AfterDecorator extends AbstractAccount {

    private RetailAccount retailAccount;

    public AfterDecorator(RetailAccount retailAccount) {
        this.retailAccount = retailAccount;
    }

    @Override
    public void withdraw(String actNo, int amount) {
        retailAccount.withdraw(actNo,amount);
        System.out.print("Doing house keeping after the amount is debited ...");
    }
}
