public class Tab {

    // Sort method (selection sort in ascending order)
    public static void sort(int[] array) {
        int i, j, min, tmp;

        for (i = 0; i < array.length - 1; i++) {
            min = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
        }
    }

    // Method to calculate average
    public static double average(int[] array) {
        int sum = 0, average = 0;

        for (int i : array) { // For each element of type "int" inside collection "array" do: "sum += i"
            sum += i;
        }        average = sum / array.length;
        return average;
    }

    public static void main(String[] args) {
        int array1[] = {3, 55, 7, 1, 88, 9, 4, -10};
        int array2[] = {10, 34, 62, 56, 82, 7, 95};

        // Sort arrays
        sort(array1);
        sort(array2);

        // Print sorted array1
        System.out.println("The sorted elements of array1 are:");
        for (int i = 0; i < array1.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(array1[i]);
        }
        System.out.println();

        // Print sorted array2
        System.out.println("The sorted elements of array2 are:");
        for (int i = 0; i < array2.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(array2[i]);
        }
        System.out.println();

        // Compute and print averages
        double avg1 = average(array1);
        double avg2 = average(array2);

        System.out.println("The average value of array1 is " + avg1);
        System.out.println("The average value of array2 is " + avg2);
    }
}

