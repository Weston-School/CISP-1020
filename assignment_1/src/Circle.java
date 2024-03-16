package src;

public class Circle extends GeometricObject {
    
    double radius;

    Circle(){};

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
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
        return Super.toString() + radius;
    }
}
