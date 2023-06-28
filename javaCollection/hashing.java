package javaCollection;
import java.util.HashSet;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> he =new HashSet<Integer>();
        he.add(83);
        he.add(74);
        he.add(89);
        he.add(696);
        System.out.println(he);
    //remove
        // he.remove(89);
        // System.out.println(he);
    // contain
    System.out.println(he.contains(78));
    // for..each loop
    for(Object e :he){
        System.out.println(e);
    }
    // union,intersection,difference
    HashSet<Integer>set1 =new HashSet<Integer>();
    set1.add(45);
    set1.add(34);
    set1.add(4);
    set1.add(43);
    System.out.println(set1);
    HashSet<Integer>set2 =new HashSet<Integer>();
    set2.add(4);
    set2.add(3);
    set2.add(2);
    set2.add(1);
    System.out.println(set2);
    // union
    set1.addAll(set2);
    System.out.println("Union "+ set1);
    // Intersection
    set1.retainAll(set2);
    System.out.println("Intersection"+set1);
    // difference
    set1.removeAll(set2);
    System.out.println(set1);
    }
}