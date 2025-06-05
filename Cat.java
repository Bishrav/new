
public class Cat extends Animal {

    public String meow() {
        System.out.print(b + "is meowing");
        return b;
    }

    public static void main(String[] args) {
        Cat e = new Cat();
        e.eat();
        e.meow();
    }

}
