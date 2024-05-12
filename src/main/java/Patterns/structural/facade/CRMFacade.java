package Patterns.structural.facade;

import Patterns.creational.singleton.CRMSystem;
import Patterns.creational.factory.LoanFactory;
import Patterns.behavioral.observer.LoanProduct;
import Patterns.behavioral.observer.Customer;

public class CRMFacade {
    private CRMSystem crmSystem = CRMSystem.getInstance();

    public void createLoanApplication(String loanType, Customer customer) {
        LoanProduct loan = LoanFactory.createLoan(loanType);
        crmSystem.addLead(customer);
        crmSystem.updateFile("Loan for " + customer.getName() + " applied as " + loanType);
        loan.calculateInterest();  // calculating interest for demo purposes
    }
}
