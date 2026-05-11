package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(); //not guaranteed the sequence.
        hs.add("My");
        hs.add("name");
        hs.add("Varun");
        hs.add("Varun");
        System.out.println(hs);
        hs.remove("Varun");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
