package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderSubject {

    List<OrderObserver> observers = new ArrayList<>();

    public void add(OrderObserver observer) {
        observers.add(observer);
    }

    public void remove(OrderObserver observer) {
        observers.remove(observer);
    }

    public void changeInOrderStatus(String orderId, String orderStatus) {
        notifyObservers(orderId, orderStatus);
    }

    private void notifyObservers(String orderId, String orderStatus) {
        for (OrderObserver observer : observers) {
            observer.update(orderId, orderStatus);
        }
    }
}
