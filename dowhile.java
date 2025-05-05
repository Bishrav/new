
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int ab = 0;
        int sum = 0;
        do { 
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the value");
            ab = sc.nextInt();
            System.out.println(ab);
            sum += ab;

        } while (ab != 2);
        System.out.println(sum);
    }
}
