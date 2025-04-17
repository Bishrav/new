
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String str = sc.next();
        char cr = sc.next().charAt(0);
        System.out.println(str); 
        System.out.println(cr);
    }
}
