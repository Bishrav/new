package b_class;

public class Main {

    public static void main(String[] args) {
        Rectangle v1 = new Rectangle(15, 16);

        System.out.println(v1.getBreadth());
        System.out.println(v1.getLength());

        v1.Calculate();
    }
}
