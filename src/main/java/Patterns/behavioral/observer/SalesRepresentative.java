package Patterns.behavioral.observer;

public class SalesRepresentative implements Observer {
    private String name;

    public SalesRepresentative(String name) {
        this.name = name;
        System.out.println("New sales representative created.");
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for Sales Rep " + name + ": " + message);
    }
}
