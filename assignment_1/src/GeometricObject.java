//  Weston Hale
//  A00267225
//  March 15th, 2024
//  Assigment 1 Program

package src;

/**
 * dateCreated is set upon object construction
 */
public class GeometricObject{
    
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        this.dateCreated = new java.util.Date();
    };

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
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

    public java.util.Date getDateCreated(){
        return this.dateCreated;
    }

    public String toString(){
        String ret_string = String.format("%s, %b, %s", color, filled, dateCreated);
        return ret_string;
    }

}
