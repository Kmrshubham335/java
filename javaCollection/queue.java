package javaCollection;
import java.util.PriorityQueue;
public class queue {
    public static void main(String[] args) 
    {
        PriorityQueue<String> str= new PriorityQueue<String>();
        // Add
        str.add("A");
        str.add("b");
        str.add("B");
        str.add("c");
        System.out.println(str);// [A, b, B, c] insertion order preserved and duplicate is allow
        // Getting a header element
        System.out.println(str.element());
        // A header element
        System.out.println(str.peek());
        // A header element
    // When queue is empty
        // System.out.println(str.element());
        // Exception in thread "main" java.util.NoSuchElementException
        // System.out.println(str.peek());
        // Exception in thread "main" java.util.NoSuchElementException.
        // RETURN and REMOVE element
        System.out.println(str.remove());
    }
    
}
