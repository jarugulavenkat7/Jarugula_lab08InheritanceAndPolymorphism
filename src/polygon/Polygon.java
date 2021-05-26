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
public class Polygon {
    private String name;
    private int noSides;

    /**
     * Constructs Polygon with name and noSides
     * @param name
     * @param noSides
     */
    public Polygon(String name, int noSides) {
        this.name = name;
        this.noSides = noSides;
    }

    /**
     * Returns name of the polygon
     * @return Returns name of the polygon
     */
    public String getName() {
        return name;
    }

    /**
     * Returns number of sides of the polygon
     * @return Returns number of sides of the polygon
     */
    public int getNoSides() {
        return noSides;
    }
            
    /**
     * Returns area of the polygon
     * @return Returns area of the polygon
     */
    public double getArea(){
        return 0.0;
    }

    /**
     * Returns perimeter of the polygon
     * @return Returns perimeter of the polygon
     */ 
    public double getPerimeter() {
        return 0.0;
            
        }
            
    /**
     * Returns InternalAngle of the polygon
     * @return Returns InternalAngle of the polygon
     */
    public double getInternalAngle() {
           return 0.0;
       }

    /**
     * Returns the polygon in toString format
     * @return Returns the polygon in toString format
     */
    @Override
    public String toString() {
     return "Polygon: " + name + "\n	Number of sides: " + noSides ;
    }
     
    
}
