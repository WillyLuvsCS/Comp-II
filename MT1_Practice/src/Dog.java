public class Dog extends Animal {
    // Dog cannot extend Animal because Animal is "final"

    public void eat (){ // if eat in Animal is final it cannot be overridden
        System.out.println("nom nom nom");
    }
}
