//  Weston Hale
//  A00267225
//  March 27th, 2024
//  InputEvenTester

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class InputEvenTester {
    public static void main(String[] args){

        File input_f = new File("numbers_input.txt");

        // Multiple try resources are possible????
        try (PrintWriter out = new PrintWriter(new PrintWriter("output.txt")); Scanner in = new Scanner(input_f);)
        {
            while(in.hasNextInt()){
                int input = in.nextInt();
                out.printf("%d %s\n", input, input % 2 == 0 ? "even" : "odd");
            }
        }
        catch(IOException e){
            System.out.println("Caught IOException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}