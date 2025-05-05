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
        int result = multiply(7, 8);
        System.out.print("the multiply is"+result);
        int fuii = multiply(7, 8);
        System.out.print("the multiply is"+fuii);

    }
    public static void sumCalculate(int a , int b) {
        System.out.print("The sum is"+(a+b));
        
    }
    public static void divCalculate(int a, int b) {
        System.out.println("The divide is"+(a/b));
    }

    public static int multiply(int a , int b) {
        int result = a * b;
        return result;
        
    }
    public static int Subtract(int a , int b) {
        int fuii = a - b;
        return fuii;
        
    }
    
}
//if there is no void we have to return for example in line number 25 and 21
