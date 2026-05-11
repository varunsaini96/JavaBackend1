package Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
//        In linkedhashset we get distinct as well as sequential order.
        lh.add(10);
        lh.add(20);
        lh.add(30);
        System.out.println(lh);
    }
}
