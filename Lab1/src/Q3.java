import java.util.Scanner;

public class Q3 {

    static int factorial(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer to calculate it's factorial: ");
        int n = sc.nextInt();

        int factorial = factorial(n);

        System.out.println(factorial);
    }

}
