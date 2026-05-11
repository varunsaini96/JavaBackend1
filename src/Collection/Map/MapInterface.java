package Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> m = new TreeMap<>();
            m.put(101,"First");
            m.put(103,"Third");
            m.put(102,"Second");
        System.out.println(m);
        System.out.println(m.get(102));
        m.remove(102);
        System.out.println(m);;
        m.replace(103,"Forth");
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
    }
}
