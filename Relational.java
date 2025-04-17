
import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        int result1 , result2;
        int a = 10 , b = 20; 
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the number");
        int age  = ab.nextInt();
        result1 = ++a;
        result2 = ++age;
        String result3 = (age >= 16) ? "You are eligible" : "You are not";
        System.out.println(result3);
        System.out.println((a != b) || (a < b));
        System.out.println((a < b) && (b > a) );
        System.out.println(!(a == b));
        System.out.println(result1);
        System.out.println(result2);
        

    }
}
