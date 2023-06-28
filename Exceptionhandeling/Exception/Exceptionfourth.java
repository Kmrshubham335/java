package Exceptionhandeling.Exception;
// handling or ducking
public class Exceptionfourth {
    class nl{
        public void a() throws Exception{
            int value=9;

            
            b();
            // function a() is calling b() 
        }
        public void b() throws Exception {
            int num1=6;
            int num2=0;
            int result=num1/num2;
            System.out.println(result);
        }
    }
    private static nl obj;   
    public static void main(String[] args) {
        //  nl obj=new nl();
        try {
            obj.a();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Cannot divide with 0" + e.getMessage());
        } 
    }
}
