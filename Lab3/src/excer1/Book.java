package excer1;

public class Book {

    // Instance fields
    private String title, author;
    private double price;
    private boolean fixedPrice;

    // one accountant for every single book
    private static Accountant accountant = new Accountant();


    // Constructors
    public Book(String a, String t) {
        author = a;
        title = t;
        price = -1.0;
        fixedPrice = false;
    }

    public Book(String a, String t, double p) {
        author = a;
        title = t;
        price = -1.0;
        fixedPrice = false;
        setPrice(p);
    }


    //getters/setters

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isFixedPrice() {
        return fixedPrice;
    }


    public void setAuthor(String sA) {
        author = sA;
    }

    public void setTitle(String sT) {
        title = sT;
    }

    public void setPrice(double p) {
        if (fixedPrice) {
            throw new IllegalStateException("Price is fixed !");
        }

        if (p < 0.0) {
            throw new IllegalArgumentException();
        }

        price = p;
        fixedPrice = true;
        accountant.count(this); // "this" tells jvm to use the object currently being manipulated
    }

    public static double getTotalPrice() {
        return accountant.getTotalPrice();
    }

    // Display method
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (price == -1.0) {
            return "Book[title=" + title + ", author=" + author + ", fixedPrice = " + fixedPrice + ", price = Price not yet provided]";
        }
        return "Book[title=" + title + ", author=" + author + ", fixedPrice = " + fixedPrice + ", price = $" + price + "]";
    }
}


