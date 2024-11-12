package lesson5.Figures;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Круг", "Чёрный", "Белый", 5);
        Circle circle2 = new Circle("Круг", "Белый", "Чёрный", 6);
        Rectangle rectangle1 = new Rectangle("Прямоугольник", "Жёлтый", "Cиний", 5, 4);
        Rectangle rectangle2 = new Rectangle("Прямоугольник", "Cиний", "Жёлтый", 5, 6);
        Triangle triangle1 = new Triangle("Треугольник", "Красный", "Зелёный", 3, 4, 5);
        Triangle triangle2 = new Triangle("Треугольник", "Красный", "Зелёный", 5, 6, 7);

        circle1.checkSum();
        circle2.checkSum();
        rectangle1.checkSum();
        rectangle2.checkSum();
        triangle1.checkSum();
        triangle2.checkSum();
    }
}
