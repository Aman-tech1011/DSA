package Oops;

public class App {
    public static void main(String[] args) {
        Student s1= new Student(1,23,"aman");
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);
       
        s1.study();
    }
}
