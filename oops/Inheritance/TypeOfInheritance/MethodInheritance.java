package oops.Inheritance.TypeOfInheritance;
class Airplane{
    void takeoff(){
        System.out.println("Airplane is takeing off");
    }
    void fly(){ //overriding method.
        System.out.println("Airplane fly ");
    }
}
class  Cargoplane extends Airplane{
//inherited method.
void fly(){ //overriding method
    System.out.println("Its fly with cargo"); //
}
}
class PassengerPlane extends Airplane{
//inherited method.
void fly(){
    System.out.println("Its fly with passenger");
}
}
public class MethodInheritance {
    public static void main(String[] args) {
        Cargoplane c=new Cargoplane();
        c.takeoff();
        c.fly();
        PassengerPlane p=new PassengerPlane();
        p.fly();
        p.takeoff();
    }
}
