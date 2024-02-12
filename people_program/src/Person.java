
/**
 * @author Weston Hale
 * @apiNote 
 */
public class Person {

    private String name = "";
    private int age;

    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return this.name;
    }

    public void set_age(int age){
        this.age = age;
    }

    public int get_age(){
        return this.age;
    }


}
