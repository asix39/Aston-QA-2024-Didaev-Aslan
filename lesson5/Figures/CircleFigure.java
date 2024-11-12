package lesson5.Figures;

public interface CircleFigure {
    String getName();
    String fillColor();
    String lineColor();

    double getRadius();

    default double perimeter() {
        return 2 * Math.PI * getRadius();
    }

    default double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    default void checkSum() {
        System.out.println("\n" + getName() + "\nПлощадь: " + area() + "\nПериметр: " + perimeter());
        System.out.println("Цвет фигуры: " + fillColor() + "\nЦвет границ: " + lineColor());
    }
}
