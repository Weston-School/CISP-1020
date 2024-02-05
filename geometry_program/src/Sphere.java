package src;

/**
 * @author Weston Hale
 * @apiNote Sphere class that holds diameter and its respective calculations
 */
public class Sphere {

    private double diameter = 0.0;
    
    public Sphere(){}

    public Sphere(double diamter){
        this.diameter = diamter;
    }

    double get_volume(){
        return (4 * Math.PI * Math.pow(diameter, 3)) / 3;
    }

}
