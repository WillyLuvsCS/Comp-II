
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
        for (int i = 0; i < nbElements; i++) {
            if (tab[i] == p) {
                return true;
            }
        }
        return false;

        // linear search for p element used in add check
    }

    public void add(int p) {
        if (has(p)) {
            return;
        }

        if (nbElements == size) {
            throw new IllegalStateException("Set is at max capacity of 20 elements!");
            // method to throw an error with context
        }

        tab[nbElements] = p;
        nbElements++;

        // firstly checks if p is already part of set & if the set is at maximum capacity,
        // if not then p is added to next available slot and the set size is increased
    }

    public void sort() {
        for (int i = 1; i < nbElements; i++) {
            int key = tab[i];
            int j = i - 1;

            // shift bigger elements to the right
            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j--;
            }

            // insert key
            tab[j + 1] = key;

            // insertion sort
        }
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
