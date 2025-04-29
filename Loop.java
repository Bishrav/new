import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        for (int i = 0; i < 10; i++){
            System.out.print("Enter your name: ");
            names[i] = scanner.next();
        }

            for (String name : names) {
                System.out.print(name + " R");
            }
        scanner.close();
    }
}