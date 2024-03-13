//  Weston Hale
//  A00267225
//  March 13th, 2024
//  MidTerm Program

// go back to #1
// go back to #17

import src.Refrigerator;
import src.Service;
import src.Sphere;
import src.ThreeDShape;

class ThreeDShapesTester {

    public static void main(String[] args){

        ThreeDShape[] fridges = {new Refrigerator(29, 30, 67), new Refrigerator(35, 36, 70), new Refrigerator(30, 31, 68)};

        // 1- Find the smallest area and display the dimensions of the smallest fridge  
        ThreeDShape smaller = Service.smallestArea(fridges[1], fridges[2]);
        if(smaller instanceof Refrigerator){
            Refrigerator sf = (Refrigerator)smaller;
            System.out.printf("Width: %.2f Height: %.2f Depth: %.2f\n", sf.getWidth(), sf.getHeight(), sf.getDepth());
        }
               
        //2-  Find the total volumes for the following balls array   
        ThreeDShape[] balls = {new Sphere(345), new Sphere(67), new Sphere(12)};
        double total_volume = Service.TotalVolumes(balls);
        System.out.printf("Total Volume: %.2f\n", total_volume);
    }
}


//public boolean equals (Object otherObject){
//    if(otherObject instanceof CellPhone){
//          CellPhone other = (CellPhone)otherObject;
//		return this.manufacturer.equals(other.manufacturer) && this.modelNumber.equals(other.modelNumber && this.retailPrice.equals(other.retailPrice);
//   }
//    return false;
// }