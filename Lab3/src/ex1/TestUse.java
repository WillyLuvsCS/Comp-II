package ex1;

public class TestUse {

    public static void main(String[] args) {


        String[] tabIn = new String[] { "Book", "off", "I" };
        String[] tab = new String[] { "Java", "C++", "off" };
        String[] tabOut = new String[] { "Id", "Name", "my" };

        String[] out = new String[tabIn.length];

        out = Use.replace(tabIn, tab, tabOut);

        System.out.print("the output of replace is: ");

        for (int i = 0; i < out.length; i++) {
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(out[i]);
        }

        System.out.println();
    }
}
