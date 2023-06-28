package javaCollection;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        HashSet<Integer> numbers = new HashSet<>();
        // Add elements to the HashSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(10); // Adding duplicate element

        // Print the HashSet
        System.out.println("HashSet: " + numbers);

        // Check if an element exists in the HashSet
        int searchNumber = 3;
        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is found in the HashSet.");
        } else {
            System.out.println(searchNumber + " is not found in the HashSet.");
        }

        // Remove an element from the HashSet
        int removeNumber = 7;
        if (numbers.remove(removeNumber)) {
            System.out.println(removeNumber + " has been removed from the HashSet.");
        } else {
            System.out.println(removeNumber + " is not found in the HashSet.");
        }

        // Print the HashSet after removing an element
        System.out.println("Updated HashSet: " + numbers);

        // Iterate over the HashSet
        System.out.println("Iterating over the HashSet:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Get the size of the HashSet
        System.out.println("Size of the HashSet: " + numbers.size());

        // Clear the HashSet
        numbers.clear();

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + numbers.isEmpty());
    }
}

