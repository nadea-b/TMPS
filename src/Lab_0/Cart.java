package Lab_0;

public class Cart {
    private double total;

    public void addBook(Book book) {
        total += book.getPrice();
        System.out.println(book.getTitle() + " added to cart.");
    }

    public double getTotal() {
        return total;
    }
}
