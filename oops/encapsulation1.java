package oops;
// private and shadowing:-This keyword 
class student
{
    private int roll;
    private String grade;
public void input1(int roll ,String grade){
    this.roll=roll;
    this.grade=grade;
}
public void input2(int roll,String grade ){
    this.roll=roll;
    this.grade=grade;
}
public void show(){
    System.out.println(roll + " " + grade);
}
}
public class encapsulation1 {
    public static void main(String[] args) {
        student s1=new student();
        s1.input1(22, "B");
        s1.show();
        student s2=new student();
        s2.input2(24, "C");
        s2.show();
}
}
