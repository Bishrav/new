

public class Classwork2 {
    public static void main(String[] args) {
        if (args.length > 2){
            System.out.println("Enter the number");
            System.out.println("Enter the operator");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        System.out.println(age);
        System.out.println(name);


    }
}
