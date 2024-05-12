package Patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractLoanProduct implements LoanProduct {
    protected List<Observer> observers = new ArrayList<>();
    protected String description;

    public AbstractLoanProduct(String description) {
        this.description = description;
    }

    // attach or detach observers to the List<Observer> observers, to be notified
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // iterates through list of Observers to notify them
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Loan status updated: " + description);
        }
    }

    // sets description and calls notifyObservers() function
    @Override
    public void setDescription(String newDescription) {
        this.description = newDescription;
        notifyObservers();  // notify observers about the description change
    }
}