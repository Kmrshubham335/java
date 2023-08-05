package Recursion;

public class alternating_Sum {
  public static void main(String[] args) {
    int n=10;
    int result=Findsum(n);
    System.out.println("Sum:" + result);
  }

  public static int Findsum(int n) {
    int sum;
    if(n==0){
      return n;
    }
    if(n%2==0){
     return sum = -n  +Findsum(n-1);
    }
    else{
      return sum=n +Findsum(n-1);
    }
  }  
}
