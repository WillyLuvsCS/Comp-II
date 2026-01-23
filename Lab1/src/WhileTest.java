public class WhileTest {
    static void main(String[] args) {

        int number = 123489, sum = 0;

        while (number > 0) {
            int LastDigit = number % 10;

            sum += LastDigit;

            number = number / 10;
        }

        System.out.println(sum); // change
    }
}