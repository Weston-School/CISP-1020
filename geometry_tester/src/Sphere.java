package src;

/**
 * @author Weston Hale
 * @apiNote Sphere class that holds radius and its respective calculations
 */
public class Sphere {

    private double radius = 0.0;

    /**
     * @param r Radius of the sphere
     */
    public Sphere(double r){
        this.radius = r;
    }

    public double get_radius(){
        return radius;
    }
    
    public double get_volume(){
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    public double get_surface_area(){
        return 4 * Math.PI * Math.pow(radius, 2); 
    }
}
