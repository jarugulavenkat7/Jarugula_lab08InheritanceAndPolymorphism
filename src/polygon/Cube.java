/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import enums.Solids;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class Cube extends Square {

    /**
     * Constructs Cube with length
     * @param length
     */
    public Cube(double length) {
        super("Cube", length);
    }

    /**
     * Returns area of the Cube
     * @return Returns area of the Cube
     */
    @Override
    public double getArea() {
        return super.getArea() * Solids.CUBE.getNoFaces();
    }

    /**
     * Returns volume of the Cube
     * @return Returns volume of the Cube
     */
    public double getVolume() {
        return Math.pow(super.getLength(), 3);
    }

    /**
     * Returns InSphereRadius of the Cube
     * @return Returns InSphereRadius of the Cube
     */
    public double getInSphereRadius() {
        return super.getLength() / 2;
    }

    /**
     * Returns CircumSphereRadius of the Cube
     * @return Returns CircumSphereRadius of the Cube
     */
    public double getCircumSphereRadius() {
        return (Math.sqrt(3) / 2) * super.getLength();
    }

    /**
     * Returns Cube in toString format
     * @return Returns Cube in toString format
     */
    @Override
    public String toString() {
        return "Polygon: " + super.getName().toUpperCase().charAt(0) + super.getName().substring(1)
                + "\n	Number of sides: " + super.getNoSides()
                + "\n	Length of side: " + super.getLength() + "cms"
                + "\n	Internal angle: " + String.format("%.2f", super.getInternalAngle()) + "\u00b0"
                + "\n	Circumcircle radius: " + String.format("%.2f", this.getCircumCircleRadius()) + "cms"
                + "\n	Incircle radius: " + String.format("%.2f", super.getInCircleRadius()) + "cms"
                + "\n	Area: " + String.format("%.2f", this.getArea()) + "cm" + "\u00b2"
                + "\n	Perimeter: " + String.format("%.2f", super.getPerimeter()) + "cms"
                + "\n	Insphere radius: " + String.format("%.2f", this.getInSphereRadius()) + "cms"
                + "\n	Circumsphere radius: " + String.format("%.2f", this.getCircumSphereRadius()) + "cms"
                + "\n	Volume: " + String.format("%.2f", this.getVolume()) + "cm" + "\u00b3";

    }

}
