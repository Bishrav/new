
public class Dog extends Animal {

    public String bark() {
        System.out.println(a + "is barking");
        return a;

    }

    public static void main(String[] args) {
        Dog e = new Dog();
        e.bark();
        e.eat();
    }

}
