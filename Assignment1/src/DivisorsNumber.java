public class DivisorsNumber {

    public static int divisorsNumber(int n) {
        int count = 0;

        if (n < 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {

        int N1=100, N2=17, N3=-3;

        /* Print*/
        System.out.println();
        System.out.println("The number of divisors of " + N1
                + " is " + divisorsNumber(N1));
        System.out.println("The number of divisors of " + N2
                + " is " + divisorsNumber(N2));
        System.out.println("The number of divisors of " + N3
                + " is " + divisorsNumber(N3));

    } // end main()

} // end class DivisorsNumbers