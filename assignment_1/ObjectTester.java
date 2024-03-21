//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

import src.Circle;
import src.GeometricObject;
import src.Rectangle;


class ObjectTester {

    public static void main(String[] args){

        // ⦁	Create a GeometricObject object and call the toString method
        GeometricObject geoObj1 = new GeometricObject("Blue", true);
        System.out.println("geoObj1 toString: " + geoObj1.toString());

        // ⦁	Create a Rectangle using the two parameters constructor object and call the toString method
        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("rect1 toString: " + r1.toString());

        // ⦁	Create a Rectangle using the four parameters constructor object and call the toString method
        Rectangle r2 = new Rectangle(5, 10, "Red", false);
        System.out.println("rect2 toString: " + r2.toString());

        // ⦁	Create a Circle using the one parameters constructor object and call the toString method
        Circle c1 = new Circle(5);
        System.out.println("circ1 toString: " + c1.toString());

        // ⦁	Create a Circle using the three parameters constructor object and call the toString method
        Circle c2 = new Circle(5, "Green", true);
        System.out.println("circ2 toString: " + c2.toString());


        // ⦁	Compare two circle object created using the three parameters constructor by calling the equals method
        Circle c3 = new Circle(5, "Yellow", true);
        Circle c4 = new Circle(5, "Orange", true);
        boolean equality = c3.equals(c4);
        System.out.println("Equals: " + equality);
    }
}
