public class method {
    public static void main(String[] args) {
        // int a = 6;
        // int b = 7;
        // System.out.println(a+b);
        // int d = 5;
        // int e = 7;
        // System.out.println(d+e);
        sumCalculate(6 ,7);
        sumCalculate(9 ,10);
        sumCalculate(4 ,3);
        divCalculate(4,2);

    }
    public static void sumCalculate(int a , int b) {
        System.out.print("The sum is"+(a+b));
        
    }
    public static void divCalculate(int a, int b) {
        System.out.print("The divide is"+(a/b));
    }
    
}
