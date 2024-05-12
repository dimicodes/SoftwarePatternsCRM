package Patterns.creational.factory;

import Patterns.behavioral.observer.AbstractLoanProduct;

public class AutoLoan extends AbstractLoanProduct {
    public AutoLoan() {
        super("Auto Loan");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest calculated for Auto Loan");
    }
}