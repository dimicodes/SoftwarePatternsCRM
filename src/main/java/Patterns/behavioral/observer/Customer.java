package Patterns.behavioral.observer;

public class Customer implements Observer {
    private String name;
    private String SSN;

    public Customer(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        System.out.println("New customer created.");
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
