import java.util.Arrays;
import java.util.Scanner;

public class EnumTutorial {
    public static void main (String[] args) {
        // DaysOfTheWeek day = new DaysOfTheWeek();

        /* You can't do this with Enums because they are different front normal classes
           since enum is a predefined set of values you use only the existing value
         */

        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;

        if (day == DaysOfTheWeek.MONDAY) {
            System.out.println("I hate mondays");
        } else {
            System.out.println("Thank god it's not a monday");
        }

        // Cool Enum stuffs

        //EnumClassName.values(); returns an array of class typed values of each member

        //In order to correctly print the values you need to import the Arrays class and apply
        // toString method
        System.out.println(Arrays.toString(DaysOfTheWeek.values()));

        // you can also use a "for each" on "DaysOfTheWeek.values"

        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }



        System.out.println("The time is " + day.timeOfDay);
    }
}
