package behavioral.observer;

public class OrderClient {
    public static void main(String[] args) {
        OrderObserver customerObserver = new CustomerNotificationObserver("Rajni");
        OrderObserver adminObserver = new AdminNotificationObserver("Ambarish");
        OrderSubject orderSubject = new OrderSubject();
        orderSubject.add(customerObserver);
        orderSubject.add(adminObserver);

        OrderService orderService = new OrderService("ORD123", orderSubject);
        orderService.changeInOrder("Received");
        orderService.changeInOrder("Preparing");
        orderService.changeInOrder("Out of delivery");
        orderService.changeInOrder("Delivered");
    }
}
