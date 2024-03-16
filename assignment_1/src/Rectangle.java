package src;

public class Rectangle extends GeometricObject {
    
    private double width;
    private double height;

    Rectangle(){};

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimiter(){
        return (width * 2) + (height * 2);
    }

    public String toString(){
        return Double.toString(getArea());
    }
}
