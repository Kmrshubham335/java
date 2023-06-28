package javaCollection;
import java.util.HashSet;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Get an instance of the Iterator
        Iterator<String> iterator = names.iterator();

        // Iterate over the elements using the Iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
