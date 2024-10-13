package Lab_0;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Simple Book", 10.00);
        Book book2 = new Book("Another Book", 20.00);

        Cart cart = new Cart();
        cart.addBook(book1);
        cart.addBook(book2);

        System.out.println("Total before discount: $" + cart.getTotal());

        Discount discount = new Discount();
        double discountedTotal = discount.applyDiscount(cart.getTotal());

        System.out.println("Total after discount: $" + discountedTotal);
    }
}
