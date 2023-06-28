package oops;
// constructor overloading same method name as class name but different parameter 
public class constructoroverloading {
    private String name;
    private int age;
    constructoroverloading(){
        System.out.println("IN default constructor");
    }
    constructoroverloading(String name){
        this.name=name;
    }
    constructoroverloading(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name"+ name);
        System.out.println("age:" + age);
    }
    public static void main(String[] args) {
        constructoroverloading dis=new constructoroverloading(); // default constructor is call
        constructoroverloading dis1=new constructoroverloading("Shubham");
        dis1.display(); // parameterized constructor call having a parameter called name 
        constructoroverloading dis2=new constructoroverloading("Shubham" ,23);
        dis2.display(); // parameterized constructor:-name and age
    }
}
