public class Book {
    // Variables
    private String title, author;

    // Constructor
   public Book(String a, String t) {
        author = a;
        title = t;
   }

   public Book() {

   }

    // getters (accessors) lets me get the private variables
    public String getAuthor() {return author;}
    public String getTitle() { return title; }

    // modifiers (or setters) lets me access the private variables
    public void setAuthor(String setA) {author = setA;}
    public void setTitle(String setT) {title = setT;}

    // display method (since inside of book class expects book object)
    public void display() {
        System.out.println("Book[title=" + getTitle() + ", author=" + getAuthor() + "]");
    }

    // utilizing toString() by default returns class name + mem hash, make my own to achieve same as display() (basically just changing the string it returns)
    @Override
    public String toString() {
       return "Book[title=" + getTitle() + ", author=" + getAuthor() + "]";
    }
}
