//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

import org.w3c.dom.css.Rect;

import src.Circle;
import src.GeometricObject;
import src.Rectangle;


class ObjectTester {

    public static void main(String[] args){

        GeometricObject geoObj1 = new GeometricObject("Blue", true);
        System.out.println("geoObj1 " + geoObj1.toString());

        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println("rect1 " + rect1.toString());


        Rectangle rect2 = new Rectangle(5, 10, "Red", false);
        System.out.println("rect2 " + rect2.toString());


        Circle circ1 = new Circle(5);
        System.out.println("circ1 " + circ1.toString());

        Circle circ2 = new Circle(5, "Green", true);
        System.out.println("circ2 " + circ2.toString());

        boolean eq = circ1.equals(circ2);
        System.out.println("Equals: " + eq);

    }
}
