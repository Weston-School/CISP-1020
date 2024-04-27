
// Weston Hale
// A00267225
// April 18th, 2024

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args){


    // Part 1 Basketball Team 
        System.out.println("\n1 - A team for basketball sorted by height ");
        TreeSet<Player> Players = new TreeSet<>(Comparator.comparingDouble(Player::getHeight)); // compareTo is added via interface in the Player class
        Players.add(new Player("Jordan", 75));  //1
        Players.add(new Player("John", 78));    //3
        Players.add(new Player("Steve", 72));   //0
        Players.add(new Player("Will", 77));    //2

        for(Player p : Players){
            System.out.printf("\tName: %s, Height:%.1f\n", p.getName(), p.getHeight());
        }


    // Part 2 Employee by Department
        System.out.println("\n2 - A collection of departments that includes the employees in each department.");
        HashMap<String, ArrayList<Employee>> Departments = new HashMap<>();

        // Allocate in place
        Departments.put("Engineering & Information Technologies", new ArrayList<>(Arrays.asList(new Employee("Hanadi Mohamed", 62000),  new Employee("Mark Palmer", 60500), new Employee("Joseph Russell", 61000))));

        // Create lists and then insert later
        Departments.put("Math & Sciences", new ArrayList<>());
        Departments.put("Social & Behavioral Sciences", new ArrayList<>());

        //Allocate and Insert an employee directly into a department
        Departments.get("Math & Sciences").add(new Employee("Rebecca Aslinger", 55000));
        Departments.get("Math & Sciences").add(new Employee("Amber Bentley", 58000));
        Departments.get("Math & Sciences").add(new Employee("Joe Boshears", 61000));

        // Create the employee and insert later
        Employee e0 = new Employee("Michael Anderson", 59000);
        Employee e1 = new Employee("Sherri Barnes", 64000);
        Employee e2 = new Employee("Shay Bean", 59800);

        Departments.get("Social & Behavioral Sciences").add(e0);
        Departments.get("Social & Behavioral Sciences").add(e1);
        Departments.get("Social & Behavioral Sciences").add(e2);

        for(String key: Departments.keySet()){
            System.out.printf("\t%s\n", key);
            for(Employee e : Departments.get(key)){
                System.out.printf("\t\tName: %s, Salary: %d\n", e.getName(), (int)e.getSalary());
            }
        }


    // Part 3 Baggage Stack
        System.out.println("\n3 - A collection of baggage in the airport that are loaded and unloaded as first in last out.");
        Stack<Baggage> baggageStack = new Stack<>();
        baggageStack.push(new Baggage("W1002", "CHA"));
        baggageStack.push(new Baggage("A0123", "ATL"));
        baggageStack.push(new Baggage("B8383", "BNA"));
        baggageStack.push(new Baggage("K1923", "FRA"));

        for (int i = baggageStack.size(); i > 0; i--){
            System.out.printf("\t%s\n", baggageStack.pop()); // toString is overriden here in the Baggage Class
        }

    // Part 4 Custom Line Queue
        System.out.println("\n4- A collection that serves the customers in the line.");
        Queue<Customer> customerQueue = new LinkedList<>();

        customerQueue.add(new Customer("Weston Hale", "weston_hale@outlook.com"));
        customerQueue.add(new Customer("John Doe", "johndoe1@gmail.com"));
        customerQueue.add(new Customer("Mary Williams", "mw1998@hotmail.com"));
        customerQueue.add(new Customer("Keith Weathers", "kjw77@aol.com"));

        System.out.printf("\tQueue Size: %d\n", customerQueue.size());
        while(customerQueue.size() > 0){
            // I was using peek and remove, but found poll instead which does both at once
            Customer c = customerQueue.poll();
            System.out.printf("\t Processing - Name: %s, Email: %s\n", c.getName(), c.getEmail());
        }
        System.out.printf("\tQueue Size: %d\n", customerQueue.size());
    }
}
