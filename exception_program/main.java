//  Weston Hale
//  A00267225
//  March 25th, 2024
//  Geometry Program

//import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Exception_Program {
    public static void main(String[] args){


        try{

            File input_f = new File("input.txt");
            Scanner in = new Scanner(input_f);


            while(in.hasNextInt()){
                int input = in.nextInt();
                System.out.println(input);
            }
            
            
            in.close();
        }
        catch(IOException e){
            System.out.println("Caught IOE: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Caught E: " + e.getMessage());
        }

    }

}