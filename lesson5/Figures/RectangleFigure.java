package lesson5.Figures;

public interface RectangleFigure {
    String getName();
    String fillColor();
    String lineColor();
    double getLength();
    double getWidth();

    default double perimeter() {
        return (getLength() + getWidth()) * 2;
    }

    default double area() {
        return getLength() * getWidth();
    }

    default void checkSum() {
        System.out.println("\n" + getName() + "\nПлощадь: " + area() + "\nПериметр: " + perimeter());
        System.out.println("Цвет фигуры: " + fillColor() + "\nЦвет границ: " + lineColor());
    }

}
