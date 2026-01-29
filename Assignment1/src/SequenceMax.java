
public class SequenceMax{
    public static int sequenceMax(int[] x) {
        int tmp, max = 1;

        for (int i = 0; i < (x.length - 1); i++) {
            tmp = 1;
            while (i < x.length - 1 && x[i] == x[i + 1]) {
                tmp++;
                i++;
            }
            if (tmp > max) {
                max = tmp;
                i++;
            }
        }
        return max;
    }



    public static void main(String[] args) {

        int[] Tab1 = {1,2,1,3,3,3,6,1,1};
        int[] Tab2 = {1,5,2,2,2,7,3,3,3,3};
        int[] Tab3 = {3,1,7,1};

        System.out.println("The longest sequence of equal consecutive elements in Tab1 is : " + sequenceMax(Tab1));
        System.out.println("The longest sequence of equal consecutive elements in Tab2 is : " + sequenceMax(Tab2));
        System.out.println("The longest sequence of equal consecutive elements in Tab3 is : " + sequenceMax(Tab3));
        System.out.println();
    }

}

