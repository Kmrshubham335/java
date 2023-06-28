package Interface;
@FunctionalInterface
interface Car
{ 
	void drive();
}
public class interfacedemo2{
	public static void main(String args[]){
        //lamda expression
		Car obj=()->System.out.println("Driving...");
		obj.drive();
	}
} 