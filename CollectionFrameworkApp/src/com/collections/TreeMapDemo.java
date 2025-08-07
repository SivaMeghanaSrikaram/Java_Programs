package com.collections;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // TreeMap without generics (raw type)
        TreeMap map = new TreeMap();

        //  Add 
        map.put(1, "Apple");
        map.put(2, 200);
        map.put(3, true);
        map.put(4, 3.14);
        map.put(5, null);     // null values allowed

        System.out.println("Initial TreeMap (sorted by key): " + map);

        // map.put(null, "NullKey"); // Throws NullPointerException

        // map.put("Six", 600); // Throws ClassCastException due to different key type

        // Duplicate key (overwrite)
        map.put(1, "Banana"); // replaces "Apple"
        System.out.println("After duplicate key (1): " + map);

        // Duplicate value (allowed)
        map.put(6, "Banana"); // same value, different key
        System.out.println("After duplicate value ('Banana'): " + map);

        // Remove 
        map.remove(2);
        map.remove(100); // key not present
        System.out.println("After removing key 2 and non-existent 100: " + map);

        // Get value
        System.out.println( map.get(1));
    

        //Contains checks
        System.out.println( map.containsKey(3));
        System.out.println(map.containsValue(3.14));
   

        // Iteration
        System.out.println("\nIterating entries (sorted by key):");
        Set keys = map.keySet();
        for (Object key : keys) {
            Object value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}