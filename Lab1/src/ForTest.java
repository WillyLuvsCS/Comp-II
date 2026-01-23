import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {

        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 10 integers: ");

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            sum = sum + n;
        }

        System.out.println(sum);
    }
}