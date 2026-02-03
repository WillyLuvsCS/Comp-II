
public class Die{

    private int value;   // Number shown on the die.

    /**
     * The constructor creates a die and rolls it so that it
     * initially shows a random value.
     */
    public Die() {
        //YOUR CODE COMES HERE
    }

    /**
     * Roll the die so that it shows a random number between 1 and 6.
     */
    public void roll() {
        // YOUR CODE COMES HERE
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
        // YOUR CODE COMES HERE
    }



//Main program

    /**
     * Roll two dice until they show the same value
     * and display the number of times these dice were rolled.
     */

    public static void main(String[] args) {

        Die die1;  // 1st die
        Die die2;  // second die

        // YOUR CODE COMES HERE

        /*displays the number of throws. */

        // YOUR DISPLAY LINE COMES HERE

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
