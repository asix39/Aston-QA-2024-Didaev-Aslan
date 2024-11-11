package lesson5.Figure;

public class Triangle implements Figure {
    String name;
    String fillColor;
    String lineColor;
    double a, b, c;

    public Triangle(String name, double a, double b, double c, String fillColor, String lineColor) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
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
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
