package oops.Inheritance.TypeOfInheritance;
class demo {
    void display(){
        System.out.println("Method of Demo in Demo3");
    }
}
class demo2 extends demo{

}
class demo3 extends demo2{

}
public class MultiInheritance {
    public static void main(String[] args) {
        demo3 de=new demo3();
        de.display();
    }
}
