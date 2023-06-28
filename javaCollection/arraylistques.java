//Create an ArrayList called "numbers" and add the integers from 1 to 5 to it. Then, iterate over the ArrayList and print each number on a separate line
package javaCollection;
import java.util.ArrayList;
public class arraylistques {
    public static void main(String[] args) {
        int add=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            numbers.add(i+1);
        }
        System.out.println(numbers);
        for(int i=0;i<numbers.size();i++){
            add = numbers.get(i)+add;
        }
        System.out.println(add);
        }
    }
