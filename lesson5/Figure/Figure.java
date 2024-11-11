package lesson5.Figure;

public interface Figure {
    double length = 0;
    double width = 0;
    String name();
    String fillColor();
    String lineColor();

    public default double getArea() {
        return length * width;
    }

    public default double getPerimeter() {
       return  (length + width) * 2;
    }
    public default void checkSumColor() {
        System.out.println("\n" + name() + "\nПлощадь: " + getArea() + "\nПериметр: " + getPerimeter());
        System.out.println("Цвет фигуры: " + fillColor() + "\nЦвет границ: " + lineColor());
    }

}
