package behavioral.strategy;

public class FixedDiscountStrategy implements DiscountStrategy {

    double fixedValue;

    public FixedDiscountStrategy(double fixedValue) {
        this.fixedValue = fixedValue;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - fixedValue;
    }
}
