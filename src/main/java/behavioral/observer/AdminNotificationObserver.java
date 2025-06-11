package behavioral.observer;

public class AdminNotificationObserver implements OrderObserver {

    private String adminName;

    public AdminNotificationObserver(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public void update(String orderId, String status) {
        System.out.println("Hello " + adminName + ", your order " + orderId + " is now " + status);
    }
}
