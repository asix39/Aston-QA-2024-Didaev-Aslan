package lesson5.Figure;

public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Круг", 5, "Красный", "Чёрный");
        Circle circle2 = new Circle("Круг", 10, "Чёрный", "Красный");
        Rectangle rectangle = new Rectangle("Прямоугольник", 5, 4, "Жёлтый", "Зелёный");
        Triangle triangle = new Triangle("Треугольник",3,4, 5, "Зелёный", "Жёлтый");

        circle1.checkSumColor();
        circle2.checkSumColor();
        rectangle.checkSumColor();
        triangle.checkSumColor();
    }
}
