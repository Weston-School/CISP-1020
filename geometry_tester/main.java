//  Weston Hale
//  A00267225
//  Feb 5th, 2024
//  Geometry Program

import java.util.Scanner;
import src.Geometry;
import src.Sphere;
import src.Cube;

class GeometryTester {
    public static void main(String[] args){

        // Open a handle on the input scanner
        Scanner in = new Scanner(System.in);

// Only taking in the height and radius once. The promt wording makes it seem this is OK.
        System.out.print("Enter radius:");
        double radius = in.nextDouble();

        System.out.print("Enter height:");
        double height = in.nextDouble();

        // Use the static Geometry functions
        System.out.printf("Static - Sphere   Vol: %.2f Sfc: %.2f\n", Geometry.sphereVolume(radius), Geometry.sphereSurface(radius));
        System.out.printf("Static - Cylinder Vol: %.2f Sfc: %.2f\n", Geometry.cylinderVolume(radius, height), Geometry.cylinderSurface(radius, height));
        System.out.printf("Static - Cube     Vol: %.2f Sfc: %.2f\n", Geometry.cubeVolume(height), Geometry.cubeSurface(height));
        System.out.printf("Static - Cone     Vol: %.2f Sfc: %.2f\n", Geometry.coneVolume(radius, height), Geometry.coneSurfaceArea(radius, height));

        
// Only two shape classes were implemented after the professor said it was OK at the end of class on Web, Jan 31st.
        // Use the Sphere class
        Sphere sphere1 = new Sphere(radius);
        System.out.printf("Class - Sphere Vol: %.2f Sfc: %.2f\n", sphere1.get_volume(), sphere1.get_surface_area());

        // Use the Cube class
        Cube cube1 = new Cube(height);
        System.out.printf("Class - Cube   Vol: %.2f Sfc: %.2f\n", cube1.get_volume(), cube1.get_surface_area());

        // Close input handle
        in.close();
    }

}