public class Claswork4 {
    String name;
    String age;
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Instance ab = new Instance();
        ab.age = 76;
        ab.name = "Bishrav";
        ab.display();

        
    }
}
