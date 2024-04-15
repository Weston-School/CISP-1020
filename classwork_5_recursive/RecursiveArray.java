//  Weston Hale
//  A00267225
//  April,15th 2024
//  RecursiveArray - Classwork 5

public class RecursiveArray {
    
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int sum;
        sum = rangeSum(numbers, 3, 7);
        System.out.println("Total: " + sum);
    }

    // This is so unsafe
    public static int rangeSum(int[] numbers, int start, int end){
        int sum = numbers[start];
        if(start < end){
            return sum + rangeSum(numbers, start + 1, end);
        }
        return sum;
    }
}
