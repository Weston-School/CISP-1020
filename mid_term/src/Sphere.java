package src;

public class Sphere implements ThreeDShape{
    
    private double radius;

    public Sphere() {};

    public Sphere(double radius){
        this.radius = radius;
    }


    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getSurfaceArea(){
        return (4 * Math.PI * (radius * radius));
        //return (4 * Math.PI * Math.pow(radius, 2));
    }

    public double getVolume(){
        return ((4.0/3.0) * Math.PI * Math.pow(radius, 3));
    }

}
