package Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
        LinkedHashMap<Integer,String> m1 = new LinkedHashMap<>(5,0.6f,true);
        m.put(10,"Ball");
        m.put(20,"Cat");
        m.put(15,"Apple");
        System.out.println(m);
        m1.put(10,"Ball");
        m1.put(20,"Cat");
        m1.put(15,"Apple");
        System.out.println(m1);
    }
}
