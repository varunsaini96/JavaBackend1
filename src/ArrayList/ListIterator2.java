package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> it = list.listIterator(3);
//        ListIterator<Integer> → Data type
//        it → Variable name
//        list.listIterator() → calling a method on the object list
        while (it.hasPrevious()){
            System.out.print(it.previous() + ",");
        }
        System.out.println();
        it = list.listIterator();
        while (it.hasNext()){
            it.add(5);
            it.next();
        }
        System.out.println(list);

        it = list.listIterator();
        while (it.hasNext()){
            int x = (Integer)it.next();
            it.set(x*x);
        }
        System.out.println(list);
    }
}
