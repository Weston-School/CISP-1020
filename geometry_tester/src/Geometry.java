package src;

/**
 * @author Weston Hale
 * @apiNote Geometry class that holds static functions for volume and area of sphere, sylinder, cube, and cone.
 */
public class Geometry {

    // Sphere
    public static double sphereVolume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    // Cylinder
    public static double cylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double cylinderSurface(double r, double h) {
        return (2 * Math.PI * r * r) + (2 * Math.PI * r * h);
    }

    // Cube
    public static double cubeVolume(double side) {
        return Math.pow(side, 3);
    }

    public static double cubeSurface(double side) {
        return 6 * Math.pow(side, 2);
    }

    // Cone
    public static double coneVolume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double coneSurfaceArea(double r, double h) {
        double sh = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        return Math.PI * r * (r + sh);
    }
}
