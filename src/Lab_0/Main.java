package Lab_0;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addBook(new Book("Book 1", 10));
        cart.addBook(new Book("Book 2", 20));

        System.out.println("Total before discount: $" + cart.getTotal());

        // Apply 10% discount
        Discount percentageDiscount = new PercentageDiscount(10);
        System.out.println("Total after 10% discount: $" + percentageDiscount.applyDiscount(cart.getTotal()));

        // Apply $5 fixed discount
        Discount fixedDiscount = new FixedAmountDiscount(5);
        System.out.println("Total after $5 discount: $" + fixedDiscount.applyDiscount(cart.getTotal()));
    }
}
