package Patterns.creational.factory;

import Patterns.behavioral.observer.AbstractLoanProduct;

public class PersonalLoan extends AbstractLoanProduct {
    public PersonalLoan() {
        super("Personal Loan");
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest calculated for Personal Loan");
    }
}
