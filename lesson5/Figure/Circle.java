package lesson5.Figure;

public class Circle implements Figure {
    String name;
    String fillColor;
    String lineColor;
    double radius;

    public Circle(String name, double radius, String fillColor, String lineColor) {
        this.name = name;
        this.radius = radius;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    public String name() {
        return name;
    }

    public String fillColor() {
        return fillColor;
    }

    public String lineColor() {
        return lineColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
