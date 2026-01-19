public class Animal {
    boolean is_Alive; // instance / field variables
    String gender, name;
    int age;

    public animal(String entered_Gender, String entered_Name, int entered_Age) {
        is_Alive = true; // predefined

        gender = entered_Gender; // parameters for (object) constructor
        name = entered_Name;
        age = entered_Age;
    }
}