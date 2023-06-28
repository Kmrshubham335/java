package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
// removing element from sorted list by using Hashset
public class Removeduplicate {
    public static void main(String[] args)
    {
        List<Integer>list1=new ArrayList<Integer>();
        list1.add(98);
        list1.add(98);
        list1.add(23);
        list1.add(908);
        list1.add(55);
        list1.add(12);
        list1.add(12);
        list1.add(1);
        list1.add(2);
        HashSet<Integer>set=new HashSet<>(list1);
        List<Integer>list2=new ArrayList<>(set);
        Collections.sort(list2);
        // System.out.println("Array after removing duplicate:");
        // for(Object ob:list2){
        //     System.out.println(ob);
        // }  
        System.out.print("Array size after sorting:");
        System.out.println(list2.size());
    
        }
    }
