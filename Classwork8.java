
import java.util.Scanner;

public class Classwork8 {
    public static void main(String[] args) {
        String name = "Bishrav";
        String password = "Hello";
        int otp = 123;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String name1 = sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the name");
        String password1 = sc1.next();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the name");
        int otp1 = sc2.nextInt();

        if (name1.equals(name) && password.equals(password1) && otp == otp1){
            System.out.println("Everything is coorect is Correct");
        }
        else if(name1.equals(name) && !password.equals(password1) && otp == otp1){
            System.out.println("Password is wrong broo");
        }

        else if(name1 != name && password.equals(password1) && otp == otp1){
            System.out.println("name is wrong broo");
        }

        else if(name1.equals(name) && password.equals(password1) && otp != otp1){
            System.out.println("otp is wrong broo");
        }
         
    

        



    }
}
