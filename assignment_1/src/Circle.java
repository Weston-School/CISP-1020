//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

package src;

public class Circle extends GeometricObject {
    
    double radius;

    Circle(){}; // The UML diagram asks for a default constructor with no params?

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }   

    public double getPerimiter(){
        return getDiamter() * Math.PI;
    }

    public double getDiamter(){
        return (radius * 2);
    }

    public String toString(){
        return radius + ", " + super.toString();
    }

    /**
     * @param otherObject an object of type Circle
     * @return True if filled, radius and color are equal
     */
    public boolean equals (Object otherObject){
        if (otherObject instanceof Circle) {
            Circle other = (Circle)otherObject;
		    return this.isFilled() == other.isFilled() && this.getRadius() == other.getRadius() && this.getColor().equals(other.getColor());
        }
        return false;
    }
}
