package behavioral.observer;

public class OrderService {
    private String orderId;
    private OrderSubject orderSubject;

    public OrderService(String orderId, OrderSubject orderSubject) {
        this.orderId = orderId;
        this.orderSubject = orderSubject;
    }

    public void changeInOrder(String status) {
        orderSubject.changeInOrderStatus(orderId, status);
    }
}
