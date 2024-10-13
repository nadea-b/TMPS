# SOLID principles


## Author: Barbarov Nadejda

----

## Objectives:

- Get familiar with the SOLID principles.
- Implement at least 2 design patterns (SOLID principles) for a chosen domain (Bookstore management):
    1. **Single Responsibility Principle (SRP)**.
    2. **Open/Closed Principle (OCP)**.

---

## Used Design Patterns:

* **Single Responsibility Principle**: I separated the responsibility for managing the cart and applying discounts into different classes (`Cart`, `PercentageDiscount`, `FixedAmountDiscount`), ensuring each class has only one responsibility.

* **Open/Closed Principle**: The `Discount` interface allows us to create different types of discounts (like `PercentageDiscount`, `FixedAmountDiscount`) without modifying the `Cart` class, demonstrating that the system is open for extension but closed for modification.

---

## Implementation:

### Explanation:

I created a basic bookstore management system where books can be added to a shopping cart, and discounts can be applied to the total price. The project follows the **Single Responsibility Principle (SRP)** by separating responsibilities (cart management vs. discount logic), and the **Open/Closed Principle (OCP)** by allowing the system to be extended with new discount types without modifying existing code.

### Code Snippets:

#### 1. `Discount` Interface
```java
public interface Discount {
    double applyDiscount(double total);
}
```
Defines a common interface for all discount types. Supports the Open/Closed Principle (OCP), allowing new discount types to be added without modifying existing code.

#### 2. `PercentageDiscount` Class
```java
public class PercentageDiscount implements Discount {
    private final double percentage;
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }
    @Override
    public double applyDiscount(double total) {
        return total - (total * percentage / 100);}
}
```
Implements the logic for applying a percentage-based discount. Adheres to Single Responsibility Principle (SRP) by keeping discount logic separate from other operations.

#### 3. `Cart` Class
```java
public class Cart {
    public void addBook(Book book) {
        total += book.getPrice();
    }
    public double getTotal() {
        return total;
    }
}
```
Handles only the task of managing the total price of books. Follows Single Responsibility Principle (SRP) by focusing solely on cart-related operations.

#### 4. `Main` Method
```java
Discount percentageDiscount = new PercentageDiscount(10);
Discount fixedDiscount = new FixedAmountDiscount(5);
```
Applies discount logic cleanly by using the Discount interface. Demonstrates the Open/Closed Principle (OCP) by allowing flexible discount types without modifying the cart logic.

## Conclusions
In this project, we successfully applied the **Single Responsibility Principle (SRP)** and the **Open/Closed Principle (OCP)** to create a flexible and maintainable bookstore system. The separation of concerns between different classes allows us to easily modify or extend the system (e.g., adding new discount types) without altering the original code. This makes the system more adaptable to change.
