package oops;
// Method overloading: same method name but different parameter
class calculator
{
    public int product(int n1, int n2){
        int res;
        return res=n1*n2;
    }
    public int  product(int n1,int n2,int n3){
        int res1;
        return res1=n1*n2*n3;
    }
    public int add(int n1,int n2){
        int res3;
        return res3=n1+n2;
    }
}
public class Methodoverloadding  {
    public static void main(String[] args) {
        calculator obj =new calculator();
      int res = obj.add(22, 22);
      int res1=  obj.product(2, 5);
      int res2=  obj.product(23, 67, 848);
        System.out.println("Product of two number :" +res1);
        System.out.println("Product of three number : " + res2);
        System.out.println("Addition of two number :" + res);

    }
}
