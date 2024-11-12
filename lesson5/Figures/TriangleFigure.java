package lesson5.Figures;

public interface TriangleFigure {
    String getName();
    String fillColor();
    String lineColor();
    double sideA();
    double sideB();
    double sideC();

    default double perimeter() {
        return sideA() + sideB() + sideC();
    }

    default double area() {
        double p = perimeter()/2;
        return Math.sqrt(p*(p-sideA())*(p-sideB())*(p-sideC()));
    }

    default void checkSum() {
        System.out.println("\n" + getName() + "\nПлощадь: " + area() + "\nПериметр: " + perimeter());
        System.out.println("Цвет фигуры: " + fillColor() + "\nЦвет границ: " + lineColor());
    }
}
