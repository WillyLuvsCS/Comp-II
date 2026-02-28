
public class SequenceOfTwo{
    public static boolean sequenceOfTwo(int[] x) {

        boolean b = false;

        for (int i = 0; i < x.length - 1; i++)
            if (x[i] == x[i+1]) {
                b = true;
                break;
            }
        return b;

        // loops through array if current index stores the same value as next
        // returns boolean true to show that array has two concurrent values
    }

    //tried to use i++, in an enhance for loop but that evaluates value first then increments and ++i increments than evaluates (for my future reference)

    public static void main(String[] args) {

        int[] Tab1 = {3,1,1,7,5};
        int[] Tab2 = {1,6,4,3,3,3};
        int[] Tab3 = {2,1,5,3,1,2,1};

        System.out.println("There is at least one sequence of two consecutive equal elements in Tab1: " + sequenceOfTwo(Tab1));

        System.out.println("There is at least one sequence of two consecutive equal elements in Tab2: " + sequenceOfTwo(Tab2));

        System.out.println("There is at least one sequence of two consecutive equal elements in Tab3: " + sequenceOfTwo(Tab3));
        System.out.println();
    }

}

