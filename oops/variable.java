package oops;
// variable in java
public class variable {
    String str="rahul";
    int x;
    // Instance variable
    public static void main(String[] args) {
        int num=6262;
        // local variable
        variable obj=new variable();
        variable obj1=new variable();
        // created a object by new keyword
        obj.str="raj";
        obj1.x=99;
        System.out.println(obj.str);
        System.out.println(obj.x);
        System.out.println(obj1.str);
        System.out.println(obj1.x);
        // reference variable 
        System.out.println(num);
        }
}
