/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class EquilateralTriangle extends RegularPolygon {

    /**
     * Constructs EquilateralTriangle with length
     * @param length
     */
    public EquilateralTriangle(double length) {
        super("Equilateral Triangle", 3, length);
    }

    /**
     * Constructs EquilateralTriangle with name and length
     * @param name
     * @param length
     */
    public EquilateralTriangle(String name, double length) {
        super(name, 3, length);
    }

    /**
     * Returns the height of Equilateral Triangle
     * @return Returns the height of Equilateral Triangle
     */
    public double getHeight() {
        return (Math.sqrt(3) / 2) * super.getLength();
    }

    /**
     * Returns Equilateral Triangle in tosString format
     * @return Returns Equilateral Triangle in tosString format
     */
    @Override
    public String toString() {
        return "Polygon: " + super.getName().toUpperCase().charAt(0) + super.getName().substring(1)
                + "\n	Number of sides: " + super.getNoSides()
                + "\n	Length of side: " + super.getLength() + "cms"
                + "\n	Internal angle: " + String.format("%.2f", super.getInternalAngle()) + "\u00b0"
                + "\n	Circumcircle radius: " + String.format("%.2f", super.getCircumCircleRadius()) + "cms"
                + "\n	Incircle radius: " + String.format("%.2f", super.getInCircleRadius()) + "cms"
                + "\n	Area: " + String.format("%.2f", super.getArea()) + "cm" + "\u00b2"
                + "\n	Perimeter: " + String.format("%.2f", super.getPerimeter()) + "cms"
                + "\n	Height: " + String.format("%.2f", this.getHeight()) + "cms";

    }

}
