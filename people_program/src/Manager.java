public class Manager extends Employee {
    
    private double bonus = 0.0;


    public Manager(){
    }

    public void set_bonus(double bonus){
        this.bonus = bonus;
    }

    public double get_bonus(){
        return this.bonus;
    }

}
