
package BackTracking;
public class tileProblem {
    public static void main(String[] args) {
        int n=6;
        int result=tiles(n);
        System.out.println("Number of ways to fill the board is "+result+"");
    }

    private static int tiles(int n) {
        if(n<=3){
            return n;                            //base case
        }
        else{
            return tiles(n-1) + tiles(n-2);          //recursive Call (same as fibonacci series only base case is change)
        }
    }
    }
