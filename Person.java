public class Person {
    private String name;
    public void setAge(int age) {
        this.age = age;
    }
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setage(int args){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Person p = new Person("Bishrav",16);
        p.setage(16);
        System.out.println(p.getAge());

    }
}
