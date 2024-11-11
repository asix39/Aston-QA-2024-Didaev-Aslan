package lesson5.AnimalsApp;

public final class AnimalsApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Вулкан", 500, 10);
        Dog dog2 = new Dog("Айка", 500, 10);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Персик", 200, 0, false, 0);
        cats[1] = new Cat("Мусик", 200, 0, false, 0);
        cats[2] = new Cat("Васька", 200, 0, false, 0);

        dog1.run(500);
        dog1.swim(10);
        dog2.run(450);
        dog2.swim(8);
        cats[0].run(200);
        cats[0].swim(5);
        cats[1].run(210);
        cats[1].swim(5);
        cats[2].run(90);
        cats[2].swim(5);

        /* Представляем, что каждому из котов,
         требуется 10ед. еды для полного насыщения. */

        Food bowl = new Food(25);
        bowl.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl.quantity);
            bowl.quantity -= cats[i].satiety;
        }
        bowl.info();
        System.out.println("Сколько единиц еды добавить в миску?");
        bowl.increaseQuantity(5);
        bowl.info();

        System.out.println("Всего животных: " + Animal.count + "\nИз них: Собак - " + Dog.count + " | Котов - " + Cat.count);
    }
}