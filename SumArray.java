
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the index value");
        int si = sc.nextInt();
        
        int [] arr = new int[si];
        int op = 0;

        for(int i = 0 ; i < arr.length; i++){
            System.out.println("enter the value");
            arr[i] = sc.nextInt();
            op += arr[i];
            

        }
        System.out.println(op);

        
    }
}
