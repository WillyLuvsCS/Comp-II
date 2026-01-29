public class Q1 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " is: " + args[i]);
        }
    }
}

// java separates words passed in cli by space and places them in args[] array.
