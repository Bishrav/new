 public class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student(String name , int age){
        this.age = age;
        this.name = name;

    }

    public void setAg(int age){
        if(age >=0){
            this.age = age;

        }
        else{
            this.age = 0;
        }
    }
    public Student(){
        this.name = "Bishrav";
        this.age = 16;
    }
    public Student(Student st1){
        this.age = st1.age;
        this.name = st1.name;
    }
}
