
import java.util.Scanner;

public class Classwork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade percentage");
        int var = sc.nextInt();

        if(var > 80){
            System.out.println("Hurray!You got A");
        }
        else if(var >= 70){
            System.out.println("Goodjob!You did better gettingB");
        }
        else if(var >= 60){
            System.out.println("Goodboy but not that good with C");
        }
        else if(var > 50 ){
            System.out.println("boiiiii you surived with D");
        }
        else{
            System.out.println("boii trust me you died F");
        }
        String data = var <= 40 ? "fail" : "Pass";
        System.out.println(data);
    }
}
