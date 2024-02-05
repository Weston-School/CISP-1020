package src;

/**
 * @author Weston Hale
 * @apiNote Cube class that holds height and its respective calculations
 */
public class Cube {

    private double height = 0.0;

    /**
     * @param h Height/Side length of the cube
     */
    public Cube(double h){
        this.height = h;
    }

    public double get_volume(){
        return Math.pow(height, 3);
    }

    public double get_surface_area(){
        return 6 * Math.pow(height, 2);
    }
}
