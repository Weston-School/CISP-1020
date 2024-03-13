package src;

public class Service {
    
    public static double TotalVolumes(ThreeDShape[] shapes){
        double sum = 0;
        for(ThreeDShape shape : shapes){
            sum += shape.getVolume();
        }
        return sum;
    }

    public static ThreeDShape smallestArea (ThreeDShape shape1, ThreeDShape shape2){
        if(shape1.getSurfaceArea() < shape2.getSurfaceArea()){
            return shape1;
        }
        return shape2;
    }

}
