package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        System.out.println(hm);
        for(Map.Entry<Integer,String>e : hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
