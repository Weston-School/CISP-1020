package src;

public class GeometricObject{
    
    private String color;
    private boolean filled;
    java.util.Date dateCreated;

    public GeometricObject() {};

    public GeometricObject(String color, boolean filled, java.util.Date dateCreated){
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }


    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public java.util.Date getDate(){
        return this.dateCreated;
    }

    public String toString(){
        return color + ", " + filled  + ", " dateCreated.toString();
    }

}
