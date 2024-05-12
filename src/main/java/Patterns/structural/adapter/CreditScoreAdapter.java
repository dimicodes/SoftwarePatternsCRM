package Patterns.structural.adapter;
import Patterns.behavioral.observer.Customer;

// implement the adapter
public class CreditScoreAdapter implements CreditScoreService {
    private ExternalCreditScoreService externalService = new ExternalCreditScoreService();

    @Override
    public int getCreditScore(Customer customer) {
        return externalService.calculateCreditScore(customer.getSSN());
    }
}

// external service that our adapter will adapt to
class ExternalCreditScoreService {
    public int calculateCreditScore(String ssn) {
        // simulating external API call
        return ssn.hashCode() % 1000;  // pseudo credit score calculation
    }
}