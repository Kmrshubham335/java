
// Note:- In a class if one body is abtract then class should be declare abstract too.
package oops.polymorphism;
abstract class shape{
    abstract void getArea();
}
class Circle extends shape{
    void getArea(){
        double area=0;
        int r=0;
        area=3.14*4*5;
        System.out.println("area:" + area);
    }
}
class Rectangle extends shape{
    void getArea(){
        double area=0;
        int l=0,w=0;
        area=5*2;
        System.out.println("Area of rectangle:=" + area);
    }
}
class Triangle extends shape{
    void getArea(){
        int area=0;
        int b=0,h=0;
        area=4*2;
        System.out.println("Area of triangle:" + area);
    }
}
public class ex2 {
    public static void main(String[] args) {
    Circle c=new Circle();
    c.getArea();
    shape t=new Triangle();
    t.getArea();
    shape r =new Rectangle();
    r.getArea(); 

}
}
