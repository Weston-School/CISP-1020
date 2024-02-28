//  Weston Hale
//  A00267225
//  Feb 28th, 2024
//  Taxable Tester Program

public class Item implements Taxable{
    
    String code;
    double price;


    public Item(String code, double price){
        this.code = code;
        this.price = price;
    }

    String getCode(){
        return code;
    }

    void setCode(String code){
        this.code = code;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price){
        this.price = price;
    }

    public double getTaxable(){
        return price;
    }

}
