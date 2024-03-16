package src;

public class Circle extends GeometricObject {
    
    double radius;

    Circle(){};

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
        return super.toString() + radius;
    }

    public boolean equals (Object otherObject){
        if (otherObject instanceof Circle) {
            Circle other = (Circle)otherObject;
		    return this.isFilled() == other.isFilled() && this.getRadius() == other.getRadius() && this.getColor().equals(other.getColor());
        }
        return false;
    }
}
