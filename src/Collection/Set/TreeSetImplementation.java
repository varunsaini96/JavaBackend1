package Collection.Set;

import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
//        get the item in sorted order.
//        distinct elements
        TreeSet<String> t = new TreeSet<>();
        TreeSet<Integer> t1 = new TreeSet<>();
        t.add("B");
        t.add("C");
        t.add("A");
        System.out.println(t);
        t1.add(5);
        t1.add(2);
        t1.add(10);
        t1.add(15);
        t1.add(20);
        System.out.println(t1);
        System.out.println(t1.lower(10));
        System.out.println(t1.higher(5));
        System.out.println(t1.ceiling(6));
        System.out.println(t1.floor(6));

    }
}
