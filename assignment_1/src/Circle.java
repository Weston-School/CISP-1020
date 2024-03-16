package src;

public class Circle extends GeometricObject {
    
    double radius;

    Circle(){};

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        java.util.Date date_now =new java.util.Date();  
        Super(color, filled, date_now);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void etRadius(double radius){
        this.radius = radius;
    }

    public double getDiamter(){
        return (radius * 2 * Math.PI);
    }

}
