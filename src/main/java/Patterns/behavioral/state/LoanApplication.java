package Patterns.behavioral.state;

public class LoanApplication {
    private LoanState currentState;

    public LoanApplication(LoanState state) {
        this.currentState = state;
        state.handleRequest(this);
    }

    public void setState(LoanState newState) {
        this.currentState = newState;
    }

    public void applyState() {
        currentState.handleRequest(this);
    }
}
