package lesson5.Figure;

public class Rectangle implements Figure {
    String name;
    String fillColor;
    String lineColor;
    double length;
    double width;

    public Rectangle(String name, double length, double width, String fillColor, String lineColor) {
        this.name = name;
        this.length = length;
        this.width = width;
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
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
