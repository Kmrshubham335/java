package javaCollection;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
    // (declare arraylist:-)
    // ArrayList <Integer> al=new ArrayList <Integer>();
// List al=new ArrayList();
        ArrayList <Integer> nl=new ArrayList<Integer>();
    // add element in arraylist(integer)
        nl.add(100);
        nl.add(8);
        nl.add(39);
        nl.add(39);
        nl.add(98);
        System.out.println(nl); 
        // [100, 8, 39, 39, 98] 
     // size of arraylist:-
        System.out.println("Number of element in arraylist are= "+ nl.size());
        // Number of element in arraylist are=5
    // remove method
          nl.remove(3);
          System.out.println(nl);
    //   [100, 8, 39, 98]
    //   3 is the index
    // nl.remove(39);
    // 39 will remove
    // add in particular index
    nl.add(2, 15);
    System.out.println("ArrayList after adding the element " + nl);
     // ArrayList after adding the element [100, 8, 15, 39, 98]
    //  retreive any specific element
    System.out.println(nl.get(3));// 39 
    // change element/replace
     nl.set(0, 210);
     System.out.println(nl);
    //[210, 8, 15, 39, 98]
    // search -contain/return boolean
    System.out.println(nl.contains(8));
// isEmpty()
    System.out.println(nl.isEmpty());// return  false
    // (1) for loop
    for(int i=0;i<nl.size();i++){
        System.out.println("element fetched by for loop are "+ nl.get(i));
    }
    // Sort --- collection.sort()
    System.out.println("element before sorting are" + nl);
    Collections.sort(nl);
    System.out.println("element after sorting are" + nl);
    // it will arrange in ascending by default
    // Arrange in descending order
    Collections.sort(nl,Collections.reverseOrder());
    System.out.println("element in descending " +nl);
    // Shuffle
    Collections.shuffle(nl);
    }
}
