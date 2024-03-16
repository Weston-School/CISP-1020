//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

import src.GeometricObject;


class ObjectTester {

    public static void main(String[] args){


        java.util.Date date_now =new java.util.Date();  

        GeometricObject geoObj = new GeometricObject("Blue", true, date_now);
        System.out.println(geoObj.toString());

        

    }
}
