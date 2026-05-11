package Collection.Dequeue;

import java.util.ArrayDeque;

public class ArrayDequeImplementation {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(); //same functions as Queue, Stack & Deque
        ad.push(10);
        ad.push(20);
        ad.push(30);
        System.out.println(ad);
        System.out.println(ad.peek());//get
        System.out.println(ad.poll());//remove queue's function
        System.out.println(ad);
        System.out.println("POP: "+ad.pop()); //remove first element or last element entered stack's method
        ad.addLast(50);
        System.out.println(ad);
        ad.push(40);
        System.out.println(ad);
    }
}
