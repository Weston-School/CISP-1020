//  Weston Hale
//  A00267225
//  March 27th, 2024
//  QuadraticTester

import java.util.Scanner;

class QuadraticTester {
    public static void main(String[] args){

        // Try resource to auto close on exception
        try(Scanner in = new Scanner(System.in)){

            System.out.print("A: ");
            double a = in.nextDouble();
            System.out.print("B: ");
            double b = in.nextDouble();
            System.out.print("C: ");
            double c = in.nextDouble();

            double square_val = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
            // Throw nan if the square is Nan (irrational/imaginary)
            if(Double.isNaN(square_val)){
                throw new NanException("No quare root for negative numbers. Make sure that b^2 is greater than 4*a*c");
            }

            double x1 = ((0-b) + square_val) / (2 * a);
            double x2 = ((0-b) - square_val) / (2 * a);

            System.out.printf("X1: %.5f  X2: %.5f\n", x1, x2);
        }
        // Catch custom exception
        catch (NanException nan_e){
            System.out.println(nan_e.getMessage());
        }
        // Catch any other exception
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}