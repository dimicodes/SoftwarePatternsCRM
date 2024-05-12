package Patterns.creational.singleton;

import Patterns.behavioral.observer.Customer;

// represents the customer relationship management system to track customers and statuses
public class CRMSystem {
    private static CRMSystem instance = new CRMSystem();

    private CRMSystem() {}

    public static CRMSystem getInstance() {
        return instance;
    }

    public void addLead(Customer customer) {
        System.out.println("Customer added: " + customer.getName());
    }

    public void updateFile(String description) {
        System.out.println("Loan updated: " + description);
    }
}
