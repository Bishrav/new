public class Mains {
    public static void main(String[] args) {
        Student s1 = new Student("hdeh",123);
        System.out.println(s1.getAge());

        Student s2 = new Student();
        System.out.println(s2.getAge());
        System.out.println(s2.getName());

        Student s3 = new Student(s1);
        System.out.println(s3.getAge());
    }

}
