//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

import java.util.Arrays;

import src.Circle;
import src.GeometricObject;
import src.Rectangle;
import src.Square;


class ColorableInterfaceTester {

    public static void main(String[] args){


        // ⦁	Write a test program that creates an array of six GeometricObject (two circles, two rectangles, and two squares). 
        GeometricObject[] geoObjects = new GeometricObject[6];

        geoObjects[0] = new Circle(5);
        geoObjects[1] = new Circle(5, "Green", true);

        geoObjects[2] = new Rectangle(5, 10);
        geoObjects[3] = new Rectangle(5, 10, "Red", false);

        geoObjects[4] = new Square(5);
        geoObjects[5] = new Square(10);


        System.out.println("Call howToColor() on the array of GeoMetricObjects");
        for (GeometricObject obj : geoObjects) {
            if(obj instanceof Square){
                Square newObject = (Square)obj;
                System.out.println(newObject.howToColor());
            }
        }


        
        // ⦁	Create an array of squares and sort it.
        Square[] squares = new Square[6];

        squares[0] = new Square(5);
        squares[1] = new Square(10);
        squares[2] = new Square(8);
        squares[3] = new Square(20);
        squares[4] = new Square(3);
        squares[5] = new Square(11);

        Arrays.sort(squares);

        System.out.println("\nSorted Squares");
        for (Square sq : squares) {
            System.out.printf("Square: Side: %.1f Area: %.1f\n", sq.getSide(), sq.getArea());
        }

    }
}