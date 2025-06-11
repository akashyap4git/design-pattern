package behavioral.observer;

public interface OrderObserver {
    public void update(String orderId, String status);
}
