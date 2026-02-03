
public class Die{

    private int value;   // (instance variable) Number shown on the die.

    /**
     * The constructor creates a die and rolls it so that it
     * initially shows a random value.
     */
    public Die() {
        roll();
    }

    /**
     * Roll the die so that it shows a random number between 1 and 6.
     */
    public void roll() {
        value = (int)(Math.random() * 6) + 1;

        // math.random returns a double in interval [0.0. 1.0)
        // multiplying stretches the interval: if r ∈ [0,1) then 6r ∈ [0,6)
        // casting the double to int (learn more ab casting)
    }

    /**
     * Returns the number shown on the die.
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the die. Prints "Illegal value of die"
     * if the value is not between 1 and 6..
     */
    public void setValue( int val ) {
       if (val >= 1 && val <= 6) {
           value = val;
       } else {
           System.out.println("Illegal value of die");

       }
    }



//Main program

    /**
     * Roll two dice until they show the same value
     * and display the number of times these dice were rolled.
     */

    public static void main(String[] args) {

        Die die1;  // 1st die
        Die die2;  // second die

        die1 = new Die();
        die2 = new Die();

        /*displays the number of throws. */

        int throwsCount = 1;

        while (die1.getValue() != die2.getValue()) {
            die1.roll();
            die2.roll();
            throwsCount++;
        }

        System.out.println("Number of throws: " + throwsCount);

        System.out.println(die1.getValue());
        System.out.println(die2.getValue());
        System.out.println();

        /* generate an exception. */
        System.out.println("This program will now terminate with an error message. ");
        System.out.println("when he tries to fix the value of a die at 100. ");
        Die die;  // variable referring to the die.
        die = new Die();  // create the object
        die.setValue(100);
    }

}  // end Die class
