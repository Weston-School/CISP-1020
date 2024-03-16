//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

import java.util.Arrays;

import src.Circle;
import src.GeometricObject;
import src.Rectangle;
import src.Square;


class InterfaceTester {

    public static void main(String[] args){


        GeometricObject[] geoObjects = new GeometricObject[6];

        geoObjects[0] = new Circle(5);
        geoObjects[1] = new Circle(5, "Green", true);

        geoObjects[2] = new Rectangle(5, 10);
        geoObjects[3] = new Rectangle(5, 10, "Red", false);

        geoObjects[4] = new Square(5);
        geoObjects[5] = new Square(10, "Red", false);


        for (GeometricObject obj : geoObjects) {
            if(obj instanceof Square){
                Square newObject = (Square)obj;
                System.out.println(newObject.howToColor());
            }
        }



        Square[] squares = new Square[6];

        squares[0] = new Square(5);
        squares[1] = new Square(10);
        squares[2] = new Square(8);
        squares[3] = new Square(20);
        squares[4] = new Square(3);
        squares[5] = new Square(11);

        Arrays.sort(squares);

        for (Square sq : squares) {
            System.out.println(sq);
        }

    }
}