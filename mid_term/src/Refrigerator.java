package src;

public class Refrigerator implements ThreeDShape{
    
    private double depth;
    private double width;
    private double height;

    public Refrigerator() {};

    public Refrigerator(double depth, double width, double height){
        this.depth = depth;
        this.width = width;
        this.height = height;
    }


    public void setDepth(double depth){
        this.depth = depth;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getDepth(){
        return this.depth;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double getSurfaceArea(){
        return (2 * ((width * depth) + (height * depth) + (height * width)));
    }

    public double getVolume(){
        return (width * depth * height);
    }

}
