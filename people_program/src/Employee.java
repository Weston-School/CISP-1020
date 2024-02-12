public class Employee extends Person {
    
    private double salary = 0.0;


    public Employee(){
    }

    public Employee(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    
    public void set_salary(double salary){
        this.salary = salary;
    }

    public double get_salary(){
        return this.salary;
    }

}
