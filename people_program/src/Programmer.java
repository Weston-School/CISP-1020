public class Programmer extends Employee {
    
    private double overtime = 0.0;


    public Programmer(){
    }

    public void set_overtime(double overtime){
        this.overtime = overtime;
    }

    public double get_overtime(){
        return this.overtime;
    }

}
