import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.nextLine();
        System.out.println("My name is "+str);
        System.out.println("\"Hello \" my is \n helo");
        sc.close();
    }
}
//for classes we use PascalConvention
//for function we use camelCaseConvention
