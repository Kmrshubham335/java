// Check if the given number number is even or odd
package Javaprogram;
public class evenodd2 {
    public static void main(String[] args) {
        int num=0;
        int currentnumber=1;
        while(num<100){
            if(currentnumber%2==0){
                System.out.println(currentnumber);
                num++;
            }
            currentnumber++;
        }
        }
    }
