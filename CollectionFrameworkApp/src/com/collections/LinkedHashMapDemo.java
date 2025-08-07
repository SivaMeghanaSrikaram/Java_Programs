package com.collections;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        // LinkedHashMap without generics (raw type)
        LinkedHashMap map = new LinkedHashMap();

        // Add 
        map.put(1, "Apple");
        map.put("Two", 2);
        map.put(3.0, true);
        map.put(true, 3.14);
        map.put(null, "NullKey");  // null key allowed
        map.put(5, null);          // null value allowed

        System.out.println("Initial LinkedHashMap (insertion order): " + map);

        //Add duplicate key (overwrites old value)
        map.put(1, "Banana");
        System.out.println("After duplicate key (1): " + map);

        //  Add duplicate value (allowed)
        map.put(6, "Banana");
        System.out.println("After duplicate value ('Banana'): " + map);

        //Remove operations
        map.remove("Two");   // existing key
        map.remove("Ten");   // non-existing key
        System.out.println("After removing 'Two' and 'Ten': " + map);

        // Get values
        System.out.println(map.get(1));
      

        //Check for keys/values
        System.out.println( map.containsKey(true));
        System.out.println( map.containsValue(3.14));
        //  Iterate through map
        System.out.println("\nIterating over entries (insertion order):");
        Set keys = map.keySet();
        for (Object key : keys) {
            Object value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}