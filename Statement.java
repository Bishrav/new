
import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for x");
        int x = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the number for y");
        int y = sc1.nextInt();
        if (x % y == 0){
            System.out.println("that is even");
            if (x / y == 2){
                System.out.println("the number is divisible by 2");
            }
            else{
                System.out.println("the number is not divisible");
            }
        }
        else if (x > 0){
            System.out.println("That is positive number");
        }
        else {
            System.out.println("The number are negative");
        }

    }
}
