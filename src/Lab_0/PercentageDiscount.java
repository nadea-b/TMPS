package Lab_0;

public class PercentageDiscount implements Discount {
    private final double percentage;

    // Constructor to initialize the discount percentage
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double total) {
        return total - (total * percentage / 100);}
}
