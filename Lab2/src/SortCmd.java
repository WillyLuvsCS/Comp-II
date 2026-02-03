import java.util.Arrays;

public class SortCmd {
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

    public static void main(String[] args) {
        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        sort(arr);


        System.out.println(Arrays.toString(arr));
    }
}
