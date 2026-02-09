package excer1;

public class Accountant {
    private double totalPrice = 0.0;


    // getter for private field var "totalPrice"
    public double getTotalPrice() {
        return totalPrice;
    }

    // keeps running count of total price of accountant for each new book
    public void count(Book b) {
        totalPrice += b.getPrice();
    }
}
