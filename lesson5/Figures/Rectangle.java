package lesson5.Figures;

import java.awt.*;

public class Rectangle implements RectangleFigure {
    private String name;
    private String fillColor;
    private String lineColor;
    private double length;
    private double width;

    public Rectangle(String name, String fillColor, String lineColor, double length, double width) {
        this.name = name;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
        this.length = length;
        this.width = width;
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

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
