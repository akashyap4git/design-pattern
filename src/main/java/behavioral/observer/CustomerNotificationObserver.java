package behavioral.observer;

public class CustomerNotificationObserver implements OrderObserver {

    private String customerName;

    public CustomerNotificationObserver(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String orderId, String status) {
        System.out.println("Hello " + customerName + ", your order " + orderId + " is now " + status);
    }
}
