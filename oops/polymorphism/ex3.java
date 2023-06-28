package oops.polymorphism;
abstract class shape{
    abstract void getArea();
}
class Circle extends shape{
    int radius;
    Circle(int r){
        int radius=r;
    }
    void getArea(){
        double area=3.14*radius*radius;
        System.out.println("area=" + area);
    }
}
public class ex3 {
    public static void main(String[] args) {
        Circle c=new Circle(4);
        c.getArea();
    }
}
