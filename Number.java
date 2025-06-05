
public class Number extends Index {

    String name = "Hello";

    void displayInfo() {
        System.out.print(name);
        System.out.print(super.name);
        super.eat();

    }

    void help(String color) {
        System.out.println(color);
        super.Ankit();

    }

    public static void main(String[] args) {
        Number e = new Number();
        e.Ankit();
    }
}
