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
public class RegularPolygon extends Polygon {

    private double length;

    /**
     * Constructs RegularPolygon with name, noSides and  length
     * @param name
     * @param noSides
     * @param length
     */
    public RegularPolygon(String name, int noSides, double length) {
        super(name, noSides);
        this.length = length;
    }

    /**
     * Returns the length of Regular Polygon
     * @return Returns the length of Regular Polygon
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns the area of Regular Polygon
     * @return Returns the area of Regular Polygon
     */
    @Override
    public double getArea() {
        return (1 / 4.0) * super.getNoSides() * Math.pow(this.length, 2) * (1 / Math.tan(Math.PI / super.getNoSides()));
    }

    /**
     * Returns the Perimeter of Regular Polygon
     * @return Returns the Perimeter of Regular Polygon
     */
    @Override
    public double getPerimeter() {
        return super.getNoSides() * this.length;
    }

    /**
     * Returns the InternalAngle of Regular Polygon
     * @return Returns the InternalAngle of Regular Polygon
     */
    @Override
    public double getInternalAngle() {
        return (180 / super.getNoSides()) * (super.getNoSides() - 2);
    }

    /**
     * Returns the InCircleRadius of Regular Polygon
     * @return Returns the InCircleRadius of Regular Polygon
     */
    public double getInCircleRadius() {
        return (this.length / 2) * (1 / Math.tan(Math.PI / super.getNoSides()));
    }

    /**
     * Returns the CircumCircleRadius of Regular Polygon
     * @return Returns the CircumCircleRadius of Regular Polygon
     */
    public double getCircumCircleRadius() {
        return (this.length / 2) * (1 / Math.sin(Math.PI / super.getNoSides()));
    }

    /**
     * Returns the  Regular Polygon in toString format
     * @return Returns the  Regular Polygon in toString format
     */
    @Override
    public String toString() {
        return "Polygon: " + super.getName().toUpperCase().charAt(0) + super.getName().substring(1)
                + "\n	Number of sides: " + super.getNoSides()
                + "\n	Length of side: " + this.length + "cms"
                + "\n	Internal angle: " + String.format("%.2f", this.getInternalAngle()) + "\u00b0"
                + "\n	Circumcircle radius: " + String.format("%.2f", this.getCircumCircleRadius()) + "cms"
                + "\n	Incircle radius: " + String.format("%.2f", this.getInCircleRadius()) + "cms"
                + "\n	Area: " + String.format("%.2f", this.getArea()) + "cm" + "\u00b2"
                + "\n	Perimeter: " + String.format("%.2f", this.getPerimeter()) + "cms";
    }

}
