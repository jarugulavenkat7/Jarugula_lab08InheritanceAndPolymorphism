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
public class Tetrahedron extends EquilateralTriangle {

    /**
     * Constructs Tetrahedron with length 
     * @param length
     */
    public Tetrahedron(double length) {
        super("Tetrahedron", length);
    }

    /**
     * Returns the height of the Tetrahedron
     * @return Returns the height of the Tetrahedron
     */
    @Override
    public double getHeight() {
        return (Math.sqrt(6) / 3) * super.getLength();
    }

    /**
     * Returns the area of the Tetrahedron
     * @return Returns the area of the Tetrahedron
     */
    @Override
    public double getArea() {
        return super.getArea() * Solids.TETRAHEDRON.getNoFaces();
    }

    /**
     *Returns the volume of the Tetrahedron
     * @return Returns the volume of the Tetrahedron
     */
    public double getVolume() {
        return (Math.sqrt(2) / 12) * Math.pow(super.getLength(), 3);
    }

    /**
     * Returns the InSphereRadius of the Tetrahedron
     * @return Returns the InSphereRadius of the Tetrahedron
     */
    public double getInSphereRadius() {
        return super.getLength() / Math.sqrt(24);
    }

    /**
     * Returns the CircumSphereRadius of the Tetrahedron
     * @return Returns the CircumSphereRadius of the Tetrahedron
     */
    public double getCircumSphereRadius() {
        return (Math.sqrt(6) / 4) * super.getLength();
    }

    /**
     * Returns the Tetrahedron in toString format 
     * @return Returns the Tetrahedron in toString format
     */
    @Override
    public String toString() {
        return "Polygon: " + super.getName().toUpperCase().charAt(0) + super.getName().substring(1)
                + "\n	Number of sides: " + super.getNoSides()
                + "\n	Length of side: " + super.getLength() + "cms"
                + "\n	Internal angle: " + String.format("%.2f", super.getInternalAngle()) + "\u00b0"
                + "\n	Circumcircle radius: " + String.format("%.2f", super.getCircumCircleRadius()) + "cms"
                + "\n	Incircle radius: " + String.format("%.2f", super.getInCircleRadius()) + "cms"
                + "\n	Area: " + String.format("%.2f", this.getArea()) + "cm" + "\u00b2"
                + "\n	Perimeter: " + String.format("%.2f", super.getPerimeter()) + "cms"
                + "\n	Height: " + String.format("%.2f", this.getHeight()) + "cms"
                + "\n	Insphere radius: " + String.format("%.2f", this.getInSphereRadius()) + "cms"
                + "\n	Circumsphere radius: " + String.format("%.2f", this.getCircumSphereRadius()) + "cms"
                + "\n	Volume: " + String.format("%.2f", this.getVolume()) + "cm" + "\u00b3";

    }
}
