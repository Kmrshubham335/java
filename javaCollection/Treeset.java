package javaCollection;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add(100);
        ts.add(56);
        ts.add(45);
        ts.add(1);
        ts.add(2);
        System.out.println(ts); //[1, 2, 45, 56, 100] in sorted order because it follow binary search tree data structure
        System.out.println(ts.higher(100)); //Null because no value is higher than 100
        System.out.println(ts.higher(56));
        System.out.println(ts.lower(2));//1
        
    }
}
