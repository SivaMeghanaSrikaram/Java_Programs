package com.collections;
import java.util.HashMap;
import java.util.Set;

public class HashMap1Demo {
    public static void main(String[] args) {

        // HashMap without generics 
        HashMap map = new HashMap();
      
      //inserting
        map.put(1, "Apple");
        map.put("Two", 2);
        map.put(3.0, true);
        map.put(true, 3.14);
        map.put(null, "NullKey");  // null key allowed
        map.put(5, null);          // null value allowed

        System.out.println("Initial map: " + map);

        //duplicate key (will overwrite)
        map.put(1, "Banana");  // key 1 already exists, value replaced
        System.out.println("After duplicate key (1): " + map);

        //Add duplicate value (allowed)
        map.put(6, "Banana");  // value is duplicate, key is different
        System.out.println("After duplicate value ('Banana'): " + map);

        //  Remove 
        map.remove("Two");      // remove by key
        map.remove(100);        // key not present, no effect
        System.out.println("After removing key 'Two' and non-existing key 100: " + map);

        //get
        System.out.println(map.get(1));
        //System.out.println("Value for key 3.0: " + map.get(3.0));
        System.out.println(map.get(100));  // null

        // Contains
        System.out.println( map.containsKey(true));
        System.out.println( map.containsKey("Two"));
    
        // Iterating keys and values
        System.out.println("Iterating map entries:");
        Set keys = map.keySet();
        for (Object key : keys) {
            Object value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}