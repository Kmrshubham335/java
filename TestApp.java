class Parent{
    public void methodOne(){
        System.out.println("methodOne from parent");
    }
}
class Child extends Parent{
    public void methodOne(){
    System.out.println("methodOne from child");}
    }
class TestApp
{
    public static void main(String args[])
    {
        Parent p=new Parent();
        p.methodOne();//methodOne from parent
        Child c=new Child();

        }

   }
