package lesson5.Figures;

import java.awt.*;

public class Triangle implements TriangleFigure {
    private String name;
    private String fillColor;
    private String lineColor;
    private double sideA, sideB, sideC;

    public Triangle(String name, String fillColor, String lineColor, double sideA, double sideB, double sideC) {
        this.name = name;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public double sideA() {
        return sideA;
    }

    public double sideB() {
        return sideB;
    }

    public double sideC() {
        return sideC;
    }
}
