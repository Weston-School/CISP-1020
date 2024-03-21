//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

import src.Circle;
import src.GeometricObject;
import src.Rectangle;


class ObjectTester {

    public static void main(String[] args){

        // ⦁	Create a GeometricObject object
        GeometricObject go1 = new GeometricObject("Blue", true);
        System.out.println(go1.toString());

        // ⦁	Create a Rectangle using the two parameters constructor
        Rectangle r1 = new Rectangle(5, 10);
        System.out.println(r1.toString());

        // ⦁	Rectangle using the four parameters constructor
        Rectangle r2 = new Rectangle(5, 10, "Red", false);
        System.out.println(r2.toString());

        // ⦁	Circle using the one parameters constructor
        Circle c1 = new Circle(5);
        System.out.println(c1.toString());

        // ⦁	Circle using the three parameters constructor
        Circle c2 = new Circle(5, "Green", true);
        System.out.println(c2.toString());


        // ⦁	Compare two circle object created using the three parameters constructor by calling the equals method
        Circle c3 = new Circle(5, "Yellow", true);
        Circle c4 = new Circle(5, "Orange", true);
        boolean equality = c3.equals(c4);
        System.out.println("C3 equals C4: " + equality);
    }
}
