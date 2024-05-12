package Patterns.structural.adapter;

import Patterns.behavioral.observer.Customer;

// the target interface
public interface CreditScoreService {
    int getCreditScore(Customer customer);
}