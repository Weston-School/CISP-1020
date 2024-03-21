//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

package src;

/**
 * Implements colorable and overloads the compareTo method to check Area
 */
public class Square extends GeometricObject implements Colorable, Comparable<Square> {

    double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public String howToColor() {
        return "Color all four sides";
    }
    
    public double getSide(){
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    //⦁	Implement the following comparable interface in the Square class:
    /**
     * Tells the user how to color the object.
     * @param other Object of type Square to compare against
     * @return Integer: 1 if the other Sqaure is larger, 0 if equals, and -1 if this Square is larger
     */
    public int compareTo(Square other) {

        if(other.getArea() > this.getArea()){
            return 1;
        }
        else if (other.getArea() == this.getArea()){
            return 0;
        }
        else {
            return -1;
        }
    }

}
