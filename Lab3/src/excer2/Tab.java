package excer2;

public class Tab {

    // selection sort
    public static void sort(int[] tab) {
        int i, j, min, tmp;
        for (i = 0; i < tab.length - 1; i++) {
            min = i;
            for (j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[min]) {
                    min = j;
                }
            }
            tmp = tab[min];
            tab[min] = tab[i];
            tab[i] = tmp;
        }
    }

    // average calculator
    public static int average(int[] tab) {
        int sum = 0;
        for (int j : tab) { // see enchancedForLoop.java for my ref
            sum += j;
        }
        return sum / tab.length; // returns an integer average
    }

    // returns how many elements in tab are less than val
    public static int count(int[] tab, int val) {
        int counter = 0;
        for (int j : tab) {
            if (j < val) {
                counter++;
            }
        }
        return counter;
    }

    // copies into small, all values less than val found in above method
    public static void split(int[] tab, int[] small, int val) {
        int j = 0;
        for (int k : tab) {
            if (k < val) {
                small[j] = k;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] tab1 = { 3, 55, 7, 1, 88, 9, 4, -10 };
        int[] tab2 = { 10, 34, 62, 56, 82, 7, 95 };

        sort(tab1);
        sort(tab2);

        int avg = average(tab2);
        int size = count(tab2, avg);
        int[] smallTab = new int[size];

        split(tab2, smallTab, avg);

        System.out.println("The sorted elements of tab1 and tab2 are:");
        for (int i = 0; i < tab1.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab1[i]);
        }
        System.out.println();

        for (int i = 0; i < tab2.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab2[i]);
        }
        System.out.println();

        System.out.println("The average value of tab2 is " + avg);

        System.out.print("The elements of smallTab are: ");
        for (int i = 0; i < smallTab.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(smallTab[i]);
        }
        System.out.println();
    }
}
