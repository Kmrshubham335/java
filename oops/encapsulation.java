package oops;
class student{
    private int  age;
    private String name;

public void input1(int a,String st){
    age=a;
    // shadowing problem occur when age=age
    name=st;

}
public void input2(int a,String st){
    age=a;
    name=st;
}
public  void show(){
    System.out.println(name + " " + age);
}
}
public class encapsulation {
    public static void main(String[] args) {
        student s=new student();
        s.input1(21,"shubham");
        s.show();
        student s1 =new student();
        s1.input1(25,"Raj");
        s1.show();
    }
}
