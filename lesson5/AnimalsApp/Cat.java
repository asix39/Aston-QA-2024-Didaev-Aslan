package lesson5.AnimalsApp;

public class Cat extends Animal {

    public static int count = 0;
    boolean hungryStatus;
    int satiety;

    public Cat(String name, int runLimit, int swimLimit, boolean hungryStatus, int satiety) {
        super(name, runLimit, swimLimit);
        this.hungryStatus = hungryStatus;
        this.satiety = satiety;
        count++;

    }

    public void eat(int quantity) {
        satiety += quantity;
        if (satiety >= 10) { // Сытость кота не может быть больше 10ед. за один приём пищи. //
            satiety = 10;
        }
        quantity -= satiety;
        if (quantity <= 0) { // Операция для предотвращения отрицательного числа в миске //
            quantity = 0;
        }
        System.out.println(name + " поел корма из миски. Осталось в миске: " + quantity);
        if (satiety >= 10) { //Представляем, что каждому из котов,требуется 10ед. еды для полного насыщения.//
            hungryStatus = true;
            System.out.println(name + " наелся(ась).");
        } else if (satiety <= 10) {
            hungryStatus = false;
            System.out.println(name + " не наелся(ась).");
        }
    }
}
