package lesson5.AnimalsApp;

public class Dog extends Animal {
    public static int count = 0;
    public Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        count++;
    }
}