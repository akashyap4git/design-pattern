package behavioral.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        DiscountStrategy fixedStrategy = new FixedDiscountStrategy(50);
        DiscountStrategy percentageStrategy = new PercentageDiscountStrategy(10);
        NoDiscountStrategy noDiscountStrategy = new NoDiscountStrategy();


        OrderService customer1Order = new OrderService("ORD1", fixedStrategy);
        OrderService customer2Order = new OrderService("ORD1", percentageStrategy);
        OrderService customer3Order = new OrderService("ORD1", noDiscountStrategy);

        System.out.println("your order final amount is " + customer1Order.calculateFinalAmount(1000));
        System.out.println("your order final amount is " + customer2Order.calculateFinalAmount(1000));
        System.out.println("your order final amount is " + customer3Order.calculateFinalAmount(1000));

    }
}
