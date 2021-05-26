/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

public enum Solids {

    /**
     * TETRAHEDRON ENUM
     */
    TETRAHEDRON(4),

    /**
     * CUBE ENUM
     */
    CUBE(6),

    /**
     * BOX ENUM
     */
    BOX(6);
    private int noFaces;

    private Solids(int noFaces) {
        this.noFaces = noFaces;
    }

    /**
     * Returns the number faces for a given solid
     * @return
     */
    public int getNoFaces() {
        return noFaces;
    }

}
