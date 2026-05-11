package Collection.Dequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueImplementation {
    public static void main(String[] args) {
        //deque is a circular array
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10); //offer adds element offer doesn't throw an exception gives boolean
        d.offerLast(20); //while add throws an exception
        d.offerFirst(5);
        d.offerLast(15);
        System.out.println(d);
        System.out.println(d.peekFirst());
        d.pollFirst(); //remove
        d.pollLast();
        System.out.println(d);
        System.out.println(d.peekFirst()); //gives the first element or alternate of getFirst

//        iterate the assending order
        Iterator it = d.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
//        iterate in desending order
        it = d.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
