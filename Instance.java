public class Instance {

    String name ; 
    int age ;

    void display(){
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args) {
        Instance ab = new Instance();
        ab.age = 76;
        ab.name = "Bishrav";
        ab.display();


        Instance ab1 = new Instance();
        ab1.age = 87;
        ab1.name = "Shiwakoti";
        ab1.display();

    }
}
