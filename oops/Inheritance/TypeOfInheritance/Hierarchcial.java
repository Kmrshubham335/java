package oops.Inheritance.TypeOfInheritance;
class Animal  extends Object{
    void display(){
        System.out.println("Tiger is Our National Animal");
    }
}
// Parent class is Animal
class Tiger extends Animal{
}
class Lion extends Animal{
}
class Monkey extends Animal{
}
public class Hierarchcial {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.display();
    }
}
