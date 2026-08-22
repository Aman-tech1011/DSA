package Oops;

public class Student {
    int id;
    int age;
    String name;
    static String colloge_name="GLA University";
    
    public Student(int id, int age, String name){
         System.out.println("constructor called : ");
         this.id=id;
         this.age=age;
         this.name=name;
    }

    void study(){
        System.out.println(name+" studying");
    }
}
