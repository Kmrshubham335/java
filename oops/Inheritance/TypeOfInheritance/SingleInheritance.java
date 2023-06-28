package oops.Inheritance.TypeOfInheritance;
//Single Inheritance:-One class is inherited by another class
class Animal{
    void display(){
        System.out.println("Tiger is Our National Animal");
    }
}
class Tiger extends Animal{

}
public class SingleInheritance {
    public static void main(String[] args) {
        Animal t=new Tiger();
        t.display();

    }
}
