package Patterns.behavioral.observer;

public interface LoanProduct {
    void calculateInterest();
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    void setDescription(String description);

}