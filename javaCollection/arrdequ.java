package javaCollection;
import java.util.ArrayDeque;
public class arrdequ {
    public static void main(String[] args) {
        ArrayDeque<String> arr = new ArrayDeque<>();
    // adding method    
        arr.add("null");
        arr.add("Kcc");
        arr.add("Kiit");
        arr.add("Krish");
        System.out.println(arr);
    //add first and add last
        arr.addFirst("hey");
        arr.addLast("hello");
        System.out.println(arr);
        
//remove method
    arr.remove("Krish");
    System.out.println(arr);
//remove first and remove last
    arr.removeFirst();
    arr.removeLast();
    System.out.println(arr);
//clear method
    arr.clear();
    System.out.println(arr);

    }
}
