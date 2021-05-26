/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Class: 44542-02 Object Oriented Programming
 * @author Venkat Sai Jarugula
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("shapes.txt"));
        ArrayList<Polygon> polygonList = new ArrayList<>();
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String[] params = line.split(" ");
            String polygonName = params[0];
            Integer numberOfSides = 0;
            Double polygonSideLength = 0.0;

            if (params.length > 2) {
                numberOfSides = Integer.parseInt(params[1]);
                polygonSideLength = Double.parseDouble(params[2]);

            } else {
                polygonSideLength = Double.parseDouble(params[1]);
            }
            Polygon polygon = null;
            if (params.length == 3) {
                polygon = new RegularPolygon(polygonName, numberOfSides, polygonSideLength);
            } else {
                switch (polygonName.toLowerCase()) {
                    case "square":
                        polygon = new Square(polygonSideLength);
                        break;
                    case "cube":
                        polygon = new Cube(polygonSideLength);
                        break;
                    case "triangle":
                        polygon = new EquilateralTriangle(polygonSideLength);
                        break;
                    case "tetrahedron":
                        polygon = new Tetrahedron(polygonSideLength);
                        break;
                }
            }
            polygonList.add(polygon);
        }
        for (Polygon polygon : polygonList) {
            System.out.println("*****************************************");
            System.out.println(polygon + "\n");
        }
        System.out.println("*****************************************");

        double minArea = polygonList.get(0).getArea();
        double maxArea = polygonList.get(0).getArea();
        double minPerimeter = polygonList.get(0).getPerimeter();
        double maxPerimeter = polygonList.get(0).getPerimeter();
        String maxAreaPolygonName = polygonList.get(0).getName();
        String minAreaPolygonName = polygonList.get(0).getName();
        String maxPerimeterPolygonName = polygonList.get(0).getName();
        String minPerimeterPolygonName = polygonList.get(0).getName();

        for (Polygon polygon : polygonList) {

            if (polygon.getArea() > maxArea) {
                maxArea = polygon.getArea();
                maxAreaPolygonName = polygon.getName();

            }
            if (polygon.getArea() < minArea) {
                minArea = polygon.getArea();
                minAreaPolygonName = polygon.getName();

            }
            if (polygon.getPerimeter() > maxPerimeter) {
                maxPerimeter = polygon.getPerimeter();
                maxPerimeterPolygonName = polygon.getName();
            }
            if (polygon.getPerimeter() < minPerimeter) {
                minPerimeter = polygon.getPerimeter();
                minPerimeterPolygonName = polygon.getName();
            }

        }
        System.out.println("The polygon with largest area is " + maxAreaPolygonName.toUpperCase().charAt(0) + maxAreaPolygonName.substring(1) + " with area of " + String.format("%.2f", maxArea) + "cm" + "\u00b2");
        System.out.println("The polygon with smallest area is " + minAreaPolygonName.toUpperCase().charAt(0) + minAreaPolygonName.substring(1) + " with area of " + String.format("%.2f", minArea) + "cm" + "\u00b2");
        System.out.println("The polygon with largest perimeter is " + maxPerimeterPolygonName.toUpperCase().charAt(0) + maxPerimeterPolygonName.substring(1) + " with perimeter of " + String.format("%.2f", maxPerimeter) + "cms");
        System.out.println("The polygon with smallest perimeter is " + minPerimeterPolygonName.toUpperCase().charAt(0) + minPerimeterPolygonName.substring(1) + " with perimeter of " + String.format("%.2f", minPerimeter) + "cms");
        System.out.println("*****************************************");
        System.out.println("Surface area to Volume ratio of given solids are:");
        for (Polygon polygon : polygonList) {
            if (polygon.getName().equalsIgnoreCase("Cube")) {
                Cube cube = new Cube(polygon.getPerimeter() / polygon.getNoSides());
                System.out.println(cube.getName() + ":");
                System.out.println("	Surface area: " + String.format("%.2f", cube.getArea()) + "cm" + "\u00B2");
                System.out.println("	Volume: " + String.format("%.2f", cube.getVolume()) + "cm" + "\u00b3");
            }
            if (polygon.getName().equalsIgnoreCase("Tetrahedron")) {
                Tetrahedron tetrahedron = new Tetrahedron(polygon.getPerimeter() / polygon.getNoSides());
                System.out.println(tetrahedron.getName() + ":");
                System.out.println("	Surface area: " + String.format("%.2f", tetrahedron.getArea()) + "cm" + "\u00B2");
                System.out.println("	Volume: " + String.format("%.2f", tetrahedron.getVolume()) + "cm" + "\u00b3");

            }
        }

        System.out.println("******************************************");
        System.out.println("Late binding polymorphism in this project::::");
        System.out.println("While printing all the Polygon’s in the arraylist we are calling the toString method\n"
                + " from Polygon class.But due to late-binding polymorphism, the run-time determination of which\n"
                + " method to invoke is made based on the receiver object.");

        System.out.println("******************************************");
        System.out.println("Polymorphic substitution in this project::::");
        System.out.println("In this project, Polygon is the super class of all the sub classes\n "
                + "RegularPolygon, Square, EquilateralTriangle, Cube and Tetrahedron.\n"
                + "We have created a polygonList which stores the objects of type Polygon,\n"
                + "but due to polymorphic substitution we are able to assign all the sub class instances to the superclass");
        System.out.println("******************************************");

    }

}
