//Finding the square root of any number by binary search technique
package interviewCode;
import java.util.*;
public class square_Number {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter the number for the square root");
        int num=dis.nextInt();

        int result=Sqrt(num);    //calling the square root function
        System.out.println("The square root of the number is:"+result);
    }
//method to find the square root
    public static int Sqrt(int num) {  
        int low=0,high=num,result=-1,mid;  
        while(low<=high){
            mid=low+(high-low)/2;      //calculating the mid value
            long val =mid*mid;         //calculate square root of middle value
            if(val==num){
                //if we find exact match then it is a perfect square
                return mid;
            }
            else if(val < num){     //square of mid value is less than target value
                result=mid;        // store the result as a possible square root and move the lower bound up
                result = mid; 
                low=mid+1;
            }
            else{
                high=mid-1;      //square of the mid value is greater than the target number,
                // move the upper bound down to search for a smaller value
            }
        }
         return result;      //returning the result
    }
}
