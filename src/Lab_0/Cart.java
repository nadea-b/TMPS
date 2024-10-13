package Lab_0;

//Single responsibility principle
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
