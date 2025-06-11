package behavioral.strategy;

public class PercentageDiscountStrategy implements DiscountStrategy {

    double percentage;
    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * (percentage/100));
    }
}
