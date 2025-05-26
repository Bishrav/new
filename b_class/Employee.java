package b_class;
import aclass.*;

public class Employee extends Person {
    public void displayEmployee(){
        System.out.println(age);
    }
    public class Main {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.displayEmployee();
        }
    }
   
}
