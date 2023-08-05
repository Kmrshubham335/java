package Recursion;
//Staircase problem
public class count {
    public static void main(String[] args) {
        int n=4;
        int result=Findcount(n+1);
        System.out.println("Number of Staircase is required:"+ result);
    }
    public static int Findcount(int n){
        if(n<=1){
            return n;
        }
        else{
            return Findcount(n-1)+Findcount(n-2);
        }
    }
}

