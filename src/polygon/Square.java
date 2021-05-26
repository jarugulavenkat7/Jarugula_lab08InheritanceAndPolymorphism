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
public class Square extends RegularPolygon {

    /**
     * Constructs Square with length
     * @param length
     */
    public Square(double length) {
        super("Square", 4, length);
    }

    /**
     * Constructs Square with name and length
     * @param name
     * @param length
     */
    public Square(String name, double length) {
        super(name, 4, length);
    }

}
