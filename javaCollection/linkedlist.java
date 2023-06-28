package javaCollection;
import java.util.LinkedList;
import java.util.Collections;
public class linkedlist {
    public static void main(String[] args) {
        // declare linkedlist
        //  LinkedList nl =new LinkedList();
         LinkedList <Integer> nm =new LinkedList<Integer>();
        // LinkedList <String> nh =new LinkedList<String>();
        // Add element in linked list
        nm.add(393);
        nm.add(445);
        nm.add(null);
        nm.add(899);
        nm.add(12);
        nm.add(12);
        nm.add(5,67);
        System.out.println(nm);
        // to find size
        System.out.println(nm.size());
        // remove by index
        nm.remove(2);
        System.out.println("New List after removing the one element" + nm);
        // Insert/Adding a new element in middle of linked list
        nm.add(3, 335);
        System.out.println("After adding new element list is " + nm);
        // retriving element
        System.out.println("retriving element = "+nm.get(0));
        // replace the exiting value
        nm.set(2, 234);
        System.out.println("After replace the value new list = " +nm);
        // for loop 
        // for(int i=0;i<nm.size();i++){
        //     System.out.println(nm.get(i));
        // }
    // for each loop
        for (Integer e: nm) 
        {
        System.out.println("for each loop"+e);    
        }
        // add all method
        LinkedList <Integer> hj =new LinkedList<Integer>();
        hj.add(001);
        hj.add(002);
        hj.add(004);
        hj.addAll(nm);
        System.out.println(hj);
        // System.out.println(hj.size());
        // remove all
        hj.removeAll(nm);
        System.out.println(hj);
        // reverse order
        Collections.sort(nm,Collections.reverseOrder());
        System.out.println("List in reverse order= " +nm);
        // ------------------------------------
        // adding element in first position.
        LinkedList<String> str=new LinkedList<String>();
        str.add("dog");
        str.add("dog");
        str.add("horse");
        str.add("rabbit");
        System.out.println(str);
        str.addFirst("Animals=");
        System.out.println(str);
    // add at the end
    str.addLast("cat");
    System.out.println(str);
        }
}
