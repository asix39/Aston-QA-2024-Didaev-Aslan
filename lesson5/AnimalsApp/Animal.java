package lesson5.AnimalsApp;

public class Animal {
    String name;
    int runLimit;
    int swimLimit;
    public static int count = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public void run(int runLength) {
        if (runLength > runLimit) {
            System.out.println(name + " устал(а)");
        }
        else {
            System.out.println(name + " пробежал(а) " + runLength + " м.");
        }
    }

    public void swim(int swimLength) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (swimLength > swimLimit) {
            System.out.println(name + " устал(а)");
        }
        else {
            System.out.println(name + " проплыл(а) " + swimLength + " м.");
        }
    }

    public void animalCounter() {
        System.out.println("Кол-во животных - " + count);
    }
}