package Lab_0;

public class FixedAmountDiscount implements Discount {
    private double amount;

    public FixedAmountDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double total) {
        return total - amount;  // e.g., subtract $5
    }
}
