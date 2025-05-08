
import java.util.Scanner;

public class Arrayeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int ab = sc.nextInt();
        int [] arr = new int[ab];
        
       for (int i = 0; i < arr.length ; i++){
        System.out.println("enter the number");
        arr[i] = sc.nextInt();
        if(arr[i] / 2 == 0){
            System.out.println("This is even");
        }
        else{
            System.out.println("odd");
        }
       }
    }
}
