package src;

public class Square extends GeometricObject implements Colorable {

    double side;

    public Square(){}

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }
    public String howToColor() {
        return "Color all four sides";
    }
    
    public double getSide(){
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
    }

}
