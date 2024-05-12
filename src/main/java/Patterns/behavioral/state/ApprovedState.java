package Patterns.behavioral.state;

public class ApprovedState implements LoanState {
    public void handleRequest(LoanApplication context) {
        System.out.println("Loan Application Approved");
    }
}
