package Patterns.creational.factory;

import Patterns.behavioral.observer.AbstractLoanProduct;

public class MortgageLoan extends AbstractLoanProduct {
    public MortgageLoan() {
        super("Mortgage Loan");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest calculated for Mortgage Loan");
    }
}