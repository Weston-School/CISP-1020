//  Weston Hale
//  A00267225
//  April,15th 2024
//  RecursiveAdd - Classwork 5

import java.util.Scanner;

public class RecursiveAdd {
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Value to add: ");
        int x = in.nextInt();
        System.out.println("Number of times: ");
        int y = in.nextInt();


        int sum = addMultiple(x, y);
        System.out.println("Total: " + sum);


        in.close();
    }


    public static int addMultiple(int value, int times){
        if(times > 0){
            return value + addMultiple(value, times - 1);
        }
        return 0;
    }
}
