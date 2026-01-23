public class DoWhileTest {
    public static void main(String[] args) {

        int number = 123489, sum = 0;

        do {
            int LastDigit = number % 10;

            sum += LastDigit;

            number = number / 10;
        } while (number > 0);

        System.out.println(sum);
    }
}
