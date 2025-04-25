
import java.util.Scanner;

public class Classword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        String var1 = sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the int");
        int var2 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the char");
        char var3 = sc2.next().charAt(0);

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the char");
        double var4 = sc3.nextDouble();

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);


    }
    
}
