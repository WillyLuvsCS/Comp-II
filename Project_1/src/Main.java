import java.util.Scanner; // must import to use scanner

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Welcome to the animal store & search program: ");
        System.out.println("Press 1 to add an animal, 2 to search for an animal.");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Select an animal to add: \n1) for Cow\n2) for Dog\n3) for Cat ");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> AnimalPrompts.addCow(sc);
                case 2 -> AnimalPrompts.addDog(sc);
                case 3 -> AnimalPrompts.addCat(sc);
                default -> System.out.println("Error: Invalid Choice");
            }
        } else {
            if (choice != 2) {
                System.out.println("Error: Invalid Choice");
                return;
            }
            // when choice is 2
        }

    }
}