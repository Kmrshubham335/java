package Map;
import java.util.*;
import java.util.Map;
public class Hashmap1 {
    public static void main(String[] args) {
        // HashMap hm=new HashMap();

        Map m=new HashMap<>();

        //order not preserved

        m.put("Name1", "Shubham");
        m.put("Name2","Raj");
        m.put("Name3", "Raju");//entry

        m.put(null, "Hello");
        // null can be allowed

        System.out.println(m);

         //LinkedHashMap perverse the order
        // LinkedHashMap lk= new LinkedHashMap<>();
        // lk.put("Name1", "Shubham");
        // lk.put("Name2","Raj");
        // lk.put("Name3", "Raju");
        // System.out.println(lk);

        //accessing value from Map by get() method

        System.out.println(m.get("Name2"));

        //accessing value and key from Map by iterator method

        Set s =m.keySet();
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println("Key is " +it.next());
    }

    Collection value =m.values();
    Iterator it1=value.iterator();
    while(it1.hasNext())
    {
        System.out.println("Value is " +it1.next());
    }
    

}
}
