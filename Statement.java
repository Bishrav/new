
import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for x");
        int x = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number for y");
        int y = sc.nextInt();
        if (x / y == 2){
            System.out.println("that is divisible");
        }
    }
}
