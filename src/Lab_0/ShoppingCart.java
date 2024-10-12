package Lab_0;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Book book : books) {
            total += book.getPrice();
        }
        return total;
    }

    public List<Book> getBooks() {
        return books;
    }
}
