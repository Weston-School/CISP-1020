//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

package src;

public class Rectangle extends GeometricObject {
    
    private double width;
    private double height;

    Rectangle(){}; // The UML diagram asks for a default constructor with no params?

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimiter(){
        return (width * 2) + (height * 2);
    }

    // ⦁	Override the toString method so as to display the area of the rectangle. <-- Is this supposed to say Square?
    public String toString(){
        return Double.toString(getArea());
    }
}
