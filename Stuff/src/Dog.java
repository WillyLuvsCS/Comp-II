import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name; // this is a keyword that specifies object method is being called on
    }

    public String getName() {
        return this.name;
    }

    // name refers to the field name but
    // also refers to the local variable
    // being used to pass a name to the constructor

    // Here java sees both name's as the local variable
    // So we use "this." to specify which is the field variables


    public void bark() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.bark();

        myDog.setName("Kramer");
        System.out.println(myDog.getName());
    }
}
