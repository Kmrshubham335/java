package oops.polymorphism;
class animal{
    void sound(){
        System.out.println("Genric sound of animal");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("bark");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meow");
    }
}
class cow extends animal{
    void sound(){
        System.out.println("Moo");
    }
}
class poly{
    public void display(animal ref){
        ref.sound();
    }
    }
public class ex1 {
    public static void main(String[] args) {
    animal d=new dog();
    animal c=new cat();
    cow cc=new cow();
    poly p=new poly();
    p.display(d);
    p.display(c);
    p.display(cc);
    
}
}