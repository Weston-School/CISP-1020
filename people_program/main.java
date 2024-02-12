//  Weston Hale
//  A00267225
//  Feb 5th, 2024
//  Geometry Program

//import java.util.Scanner;

class PersonProgram {
    public static void main(String[] args){


        Person p1 = new Person();
        p1.set_name("Adam");
        p1.set_age(18);
        System.out.printf("Name: %s Age: %d\n", p1.get_name(), p1.get_age());


        Employee e1 = new Employee();
        e1.set_name("John");
        e1.set_age(25);
        e1.set_salary(50000);
        System.out.printf("Employee Name: %s Age: %d Salary: %f\n", e1.get_name(), e1.get_age(), e1.get_salary());


        Employee e2 = new Employee("Stan", 30, 47000);
        System.out.printf("Employee Name: %s Age: %d Salary: %f\n", e2.get_name(), e2.get_age(), e2.get_salary());


        Manager m1 = new Manager();
        m1.set_name("Ethan");
        m1.set_age(45);
        m1.set_salary(60000);
        m1.set_bonus(10000);
        System.out.printf("Manager Name: %s Age: %d Salary: %f Bonus: %f\n", m1.get_name(), m1.get_age(), m1.get_salary(), m1.get_bonus());

        Programmer pr1 = new Programmer();
        pr1.set_name("Joey");
        pr1.set_age(35);
        pr1.set_salary(70000);
        pr1.set_overtime(5);
        System.out.printf("Manager Name: %s Age: %d Salary: %f Overtime: %f\n", pr1.get_name(), pr1.get_age(), pr1.get_salary(), pr1.get_overtime());


        // Open a handle on the input scanner
        //Scanner in = new Scanner(System.in);

        //System.out.print("Enter radius:");
        //double radius = in.nextDouble();

        // Close input handle
        //in.close();
    }

}