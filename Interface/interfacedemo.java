//interface basics program.
package Interface;
interface a{
void display();
}
interface b{
    void display();
}
class nl implements b{
     public void display(){
        System.out.println("in a class method");
    }
}
public class interfacedemo {
    public static void main(String[] args) {
        nl obj=new nl()
        {
            public void display(){
                System.out.println("IN the interfacedemo class");   //anonymous class
            }
        };
        obj.display();
        
    }
}
