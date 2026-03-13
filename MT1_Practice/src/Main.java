public static void main(String[] args) {
    Static_oop myCat = new Static_oop();

    myCat.meow(); // only objects can meow (non-static method)
    // Ex1.meow(); doesn't work

    //fields are non static as well

    myCat.name = "Stella"; // changing the instance variable (non static variable)

    // basically means that each Ex1 objject is created with all instance variables
    // initizalized

    // Use is so multiple objects can have the same "Name" and "Age" but dont conflict with
    // eachother. if u want all objecs of same type to share a common attribute you can make it
    // static
    System.out.println(Static_oop.getCatCount());

    final int y;
    y = 7;



}