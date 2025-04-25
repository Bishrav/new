
import java.util.Scanner;

public class Classwork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int var = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int var1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the operator");
        String var2 = sc2.next();

        switch(var2){

            case "+":
                System.out.println(var + var1);
                break;

            case "*":
                System.out.println(var * var1);  
                break;
            
            case "/":
                if (var1 == 0){
                    System.out.println("its an error");
                }
                else{
                System.out.println(var / var1);
                }
                break;

            case "-":
                System.out.println(var - var1);
                break;


        }

            

    }
    
}
