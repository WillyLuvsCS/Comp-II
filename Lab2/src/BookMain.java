public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("J.K Rowling", "Harry Potter & the Philosopher's Stone");
        Book book2 = new Book("F. Scott Fitzgerald", "The Great Gatsby");

        book1.display();
        System.out.println(book1); // same as doing toString(book1);
    }
}
