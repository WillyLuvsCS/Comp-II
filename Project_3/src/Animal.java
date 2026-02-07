public abstract class Animal {
    int age;
    String name;
    public abstract void makeNoise();

    // abstract classes just define something for inheritance

    public void printName() {
        System.out.println("My name is " + name);
    }
}
