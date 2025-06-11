package behavioral.strategy;

public class OrderService {
    private String orderId;
    private DiscountStrategy discountStrategy;

    public OrderService(String orderId, DiscountStrategy discountStrategy) {
        this.orderId = orderId;
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalAmount(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
