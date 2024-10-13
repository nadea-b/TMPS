package Lab_0;

public interface DiscountCalculator {
    double applyDiscount(double total);
}

public class PercentageDiscountCalculator implements DiscountCalculator {
    private double percentage;

    public PercentageDiscountCalculator(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double total) {
        return total - (total * (percentage / 100));
    }
}
