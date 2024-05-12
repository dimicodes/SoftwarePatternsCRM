package Patterns.behavioral.state;

public class NewState implements LoanState {
    public void handleRequest(LoanApplication context) {
        System.out.println("Handling New Loan Application");
        context.setState(new UnderReviewState());
    }
}
