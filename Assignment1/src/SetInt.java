
public class SetInt {

    private int[] tab ;
    private int size ;
    private int nbElements ;

    public SetInt ( ) {
        size = 20;
        tab = new int[size];
        nbElements = 0;
    }
    public int getNbElements() {
        return nbElements;
    }

    public boolean has(int p) {
        // YOUR CODE COMES HERE
    }

    public void add(int p) {
        // YOUR CODE COMES HERE
    }

    public  void sort( ){
        // YOUR CODE COMES HERE
    }

    public String toString() {
        if (nbElements == 0)
            return "{}";
        else {
            String str =  "{" + tab[0];
            for (int i = 1; i < nbElements; i++)
                str += "," + tab[i];
            return str + "}";
        }
    }

    /*
     * MAIN
     *
     */
    static public void main(String[] args) {
        SetInt set = new SetInt();
        System.out.println("Please enter the elements of your set (positive integers):" );
        System.out.println("To exit, enter a negative integer:" );
        int n = ReadInt.getInt("your first integer: ");
        while (n >= 0 ) {
            set.add(n);
            n = ReadInt.getInt("Next integer: ");
        }

        System.out.println("My set contains " + set.getNbElements() + " elements: ");
        System.out.println("set = " + set);
        set.sort();
        System.out.println("My sorted set is:" );
        System.out.println("set = " + set);
    }
}
