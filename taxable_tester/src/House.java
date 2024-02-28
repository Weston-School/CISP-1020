//  Weston Hale
//  A00267225
//  Feb 28th, 2024
//  Taxable Tester Program

public class House implements Taxable{
    
    String id;
    double value;


    public House(String id, double value){
        this.id = id;
        this.value = value;
    }

    String getId(){
        return id;
    }

    void setId(String id){
        this.id = id;
    }

    double getValue(){
        return value;
    }

    void setValue(double value){
        this.value = value;
    }

    public double getTaxable(){
        return value;
    }

}
