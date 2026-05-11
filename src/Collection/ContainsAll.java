package Collection;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println("L1 list contains: "+l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(30);
        System.out.println("L2 list contains: "+l2);
        System.out.println(l1.containsAll(l2));
//        l1.retainAll(l2);
//        l1.removeAll(l2);
//        l1.removeIf((n)->(n%2==0));
        l1.removeIf(n->n>15);
        System.out.println(l1);
    }
}
