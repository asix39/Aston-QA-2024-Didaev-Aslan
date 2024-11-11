package lesson5.AnimalsApp;

public class Food {
    int quantity;
    public Food(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity(int n) {
        quantity -= n;
    }

    public void increaseQuantity(int n) {
        quantity += n;
    }

    public void info() {
        System.out.println("Всего еды в миске: " + quantity);
    }
}
