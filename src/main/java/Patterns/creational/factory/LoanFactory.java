package Patterns.creational.factory;

import Patterns.behavioral.observer.LoanProduct;

// creates a new loan of type personal, mortgage, or auto
public class LoanFactory {
    public static LoanProduct createLoan(String type) {
        System.out.println("Loan Factory has created a new loan.");
        if (type.equalsIgnoreCase("personal")) {
            return new PersonalLoan();
        } else if (type.equalsIgnoreCase("mortgage")) {
            return new MortgageLoan();
        } else if (type.equalsIgnoreCase("auto")) {
            return new AutoLoan();
        } else {
            throw new IllegalArgumentException("Unknown loan type: " + type);
        }
    }
}
