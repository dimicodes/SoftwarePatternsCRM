package Patterns.behavioral.state;

public interface LoanState {
    void handleRequest(LoanApplication context);
}
