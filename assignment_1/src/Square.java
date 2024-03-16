package src;

public class Square extends GeometricObject implements Colorable, Comparable<Square> {

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

    public double getArea(){
        return side * side;
    }

    public String toString(){
        return Double.toString(getArea());
    }

    public int compareTo(Square other) {

        // This should match how the normal compareto method works with strings?
        if(other.getArea() > this.getArea()){
            return 1;
        }
        else if (other.getArea() == this.getArea()){
            return 0;
        }
        else {
            return -1;
        }
    }

}
