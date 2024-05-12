package Patterns;

import Patterns.behavioral.observer.Customer;
import Patterns.behavioral.observer.LoanProduct;
import Patterns.behavioral.observer.SalesRepresentative;
import Patterns.behavioral.state.LoanApplication;
import Patterns.behavioral.state.NewState;
import Patterns.creational.factory.LoanFactory;
import Patterns.creational.singleton.CRMSystem;
import Patterns.structural.adapter.CreditScoreAdapter;
import Patterns.structural.adapter.CreditScoreService;
import Patterns.structural.facade.CRMFacade;

public class Main {
    public static void main(String[] args) {

        // testing Factory and Observer patterns
        System.out.println("---Testing Factory and Observer---");
        LoanProduct loan = LoanFactory.createLoan("mortgage"); // LoanFactory creates LoanProduct
        Customer customer = new Customer("John Doe", "123-45-6789"); // implements observer
        SalesRepresentative salesRep = new SalesRepresentative("Alice"); // implements observer

        loan.attach(customer); // attaches customer to List<Observer> observers for the loan
        loan.attach(salesRep);
        System.out.println();

        // update and notify
        System.out.println("---Testing Notifications---");
        loan.setDescription("Mortgage Loan Approved"); // notifies observers of description change
        System.out.println();

        // testing State Pattern
        System.out.println("---Testing States---");
        LoanApplication loanApp = new LoanApplication(new NewState()); // sets LoanState to NewState
        loanApp.applyState();  // New state to Under Review state
        loanApp.applyState();  // Under Review state to Approved state
        System.out.println();

        // testing Singleton Pattern CRM System
        System.out.println("---Testing CRM System---");
        CRMSystem crmSystem = CRMSystem.getInstance(); // creates instance of CRMSystem
        crmSystem.addLead(customer); // adds a lead/customer to the CRM
        // updates the file (the particular instance of the CRM) with a note
        crmSystem.updateFile("Loan updated to approved status, waiting for client's docs.");
        System.out.println();

        // testing Adapter Pattern for credit score
        System.out.println("---Testing Credit Score Adapter---");
        CreditScoreService creditScoreAdapter = new CreditScoreAdapter();
        int creditScore = creditScoreAdapter.getCreditScore(customer);
        System.out.println("Credit Score for " + customer.getName() + " is: " + creditScore);
        System.out.println();

        // testing Facade Pattern
        System.out.println("---Testing CRM Facade---");
        CRMFacade crmFacade = new CRMFacade();
        crmFacade.createLoanApplication("auto", customer);
        System.out.println();

        // display interest calculations
        loan.calculateInterest();  // calculate interest for the created mortgage Loan
    }
}
