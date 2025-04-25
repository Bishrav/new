public class Employee {
    String name;
    int salary;
    String myvariable ;
    static String data = "Mobizilla" ;

    void display(){
        System.out.println(name);
        System.out.println(salary);

    }
    public static void main(String[] args) {
        System.out.println(Static.data);
    }
}
