//  Weston Hale
//  A00267225
//  Feb 21st, 2024
//  EdibleProgram Program

import java.util.Scanner;

class EdibleProgram {
    public static void main(String[] args){

        // Open a handle on the input scanner
        //Scanner in = new Scanner(System.in);
        // Close input handle
        //in.close();


        Object[] objects = {new Apple(), new Orange(), new Chicken(), new Tiger()};

        for(Object obj : objects){

            if(obj instanceof Edible){
                System.out.printf("How to eat: %s\n", ((Edible)obj).howToEat());
            }
        }

    }

}