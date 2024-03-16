package src;

import org.w3c.dom.css.Rect;

public class Rectangle extends GeometricObject {
    
    private double width;
    private double height;

    Rectangle(){};

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled){
        Super(color, filled);
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
}
