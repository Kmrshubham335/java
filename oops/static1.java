package oops;
// Static keyword in java
class student
{
    int age;
    static String school="xyx";   
    // now this variable became a static or non instance variable.
    public void show(){
        System.out.println("show my age" + age  + "and school" + school);
    }
    public static void name(){
        // System.out.println(age); static variable can be accessed in non-static method
        // System.out.println(school);static variable can be access
        int a =34;
    }
}
public class static1 {
    public static void main(String[] args) {
        student obj=new student();
        obj.age=19;
        obj.show();
        student obj1=new student();
        obj1.age=23;
        obj1.show();
        System.out.println(student.school); //Static variable call
        
    }
    
}
