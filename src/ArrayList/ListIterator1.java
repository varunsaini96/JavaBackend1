package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);

        ListIterator<Integer> lt = ls.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }

    }
}
