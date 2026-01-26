import java.util.Arrays; // IntelliJ automatically added this

public class Sum {
 public static void main(String[] args) { // passing arrays in java: Type[] Name
    int sum = 0;

    for (String arg : args) {   // for (Type variable : collection)
        try { // runs code in jvm and if crash java will do catch(errortype name)
            int num = Integer.parseInt(arg);
            sum += num;
        } catch(NumberFormatException e) { // required to name a caught exception in a catch block to know what error u wanna catch.
            System.out.println("Argument:" + arg + "is an invalid number.");
            return;
        }
    }

     System.out.println("The sum of args: " + Arrays.toString(args) + " is " + sum);

    // For each element of type "String" inside collection "args", call it variable "arg".

    /* for (int i = 0; i < args.length; i++) {
            String arg = args[i];   } */
 }
}

