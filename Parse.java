public class Parse {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("please enter the number and operator");
            return;
        }
        String operator = args[0];
        int number = Integer.parseInt(args[1]);
        System.out.println(operator);
        System.out.println(number);
    }
    
}
