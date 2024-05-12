package Patterns.behavioral.state;

public class UnderReviewState implements LoanState {
    public void handleRequest(LoanApplication context) {
        System.out.println("Loan Application Under Review");
        context.setState(new ApprovedState());
    }
}
