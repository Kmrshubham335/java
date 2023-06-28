package Map;
import java.util.*;
class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "hello");
        ht.put(2, "world");
        System.out.println(ht);
    }
}
