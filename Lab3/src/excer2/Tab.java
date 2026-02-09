package excer2;

public class Tab {

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

    public static int average(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum / tab.length;
    }

    public static int count(int[] tab, int val) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < val) {
                counter++;
            }
        }
        return counter;
    }

    public static void split(int[] tab, int[] small, int val) {
        int j = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < val) {
                small[j] = tab[i];
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int tab1[] = { 3, 55, 7, 1, 88, 9, 4, -10 };
        int i, average, size;
        int[] smallTab, tab2;
        tab2 = new int[] { 10, 34, 62, 56, 82, 7, 95 };

        sort(tab1);
        sort(tab2);

        average = average(tab2);
        size = count(tab2, average);
        smallTab = new int[size];
        split(tab2, smallTab, average);

        System.out.println("The sorted elements of tab1 and tab2 are:");
        for (i = 0; i < tab1.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab1[i]);
        }
        System.out.println();

        for (i = 0; i < tab2.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab2[i]);
        }
        System.out.println();

        System.out.println("The average value of tab2 is " + average);

        System.out.print("The elements of smallTab are: ");
        for (i = 0; i < smallTab.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(smallTab[i]);
        }
        System.out.println();
    }
}
