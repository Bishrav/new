public class Function {

    void display(){
        System.out.print("sjdja");
    }
    static int multiply(int a , int b){
        return a * b;

    }
    public static void main(String[] args) {
        Function func = new Function();
        int sum = multiply(7, 8);
        System.out.println(sum);

        func.display();
        
    }
}
