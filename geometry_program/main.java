//  Weston Hale
//  A00267225
//  Feb 5th, 2024
//  Geometry Program

import java.util.Scanner;
import src.Geometry;
import src.Sphere;
import src.Cube;

class BankAccountTester {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius:");
        double radius = in.nextDouble();

        System.out.print("Enter height:");
        double height = in.nextDouble();


        System.out.printf("Static - Sphere   Volume: %.2f Surface: %.2f\n", Geometry.sphereVolume(radius), Geometry.sphereSurface(radius));
        System.out.printf("Static - Cylinder Volume: %.2f Surface: %.2f\n", Geometry.cylinderVolume(radius, height), Geometry.cylinderSurface(radius, height));
        System.out.printf("Static - Cube     Volume: %.2f Surface: %.2f\n", Geometry.cubeVolume(height), Geometry.cubeSurface(height));
        System.out.printf("Static - Cone     Volume: %.2f Surface: %.2f\n", Geometry.coneVolume(radius, height), Geometry.coneSurfaceArea(radius, height));



        // Sphere with Sphere class
        Sphere sphere1 = new Sphere(radius);
        System.out.printf("Class - Sphere Volume: %.2f Surface: %.2f\n", sphere1.get_volume(), sphere1.get_surface_area());

        // Cube with Cube class
        Cube cube1 = new Cube(height);
        System.out.printf("Class - Cube   Volume: %.2f Surface: %.2f\n", cube1.get_volume(), cube1.get_surface_area());


        in.close();
    }

}