public class Static_oop {


    public static final int MAX_COUNT = 100; // static used for a constant (constants cant be changed later)
    // static and final

    // constructor
    public Static_oop() {
        catCount++;
    }

    // fields (non static)
    String name;

    int age;

    static int livesRemaining;

    private static int catCount = 0;

    //methods (non static)
    public void meow() {
        System.out.println("meow");
    }

    public static int getCatCount() { // in a non static method u cannot refer to static fields
        return catCount;
        // cant do sout(Ex1.age);
    }

    // however u can access static fields from a non static method
    // Discouraged

    // static fields are used for constants refer to top
}
