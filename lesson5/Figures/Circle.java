package lesson5.Figures;

public class Circle implements CircleFigure {
    private String name;
    private String fillColor;
    private String lineColor;
    private double radius;

    public Circle(String name, String fillColor, String lineColor, double radius) {
        this.name = name;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public String fillColor() {
        return fillColor;
    }

    public String lineColor() {
        return lineColor;
    }

    public double getRadius() {
        return radius;
    }
}
