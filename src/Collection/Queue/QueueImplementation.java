package Collection.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); //faster than linkedlist
//        Queue<Integer> q = new LinkedList<>(); //Guarantee the worst case
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println("Giving the first item in a queue: "+q.peek()); //work as element
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.offer(40)); //add at the last
        System.out.println(q);
        System.out.println("It also remove from the first: "+q.poll()); //same as remove
        System.out.println(q);
    }
}
