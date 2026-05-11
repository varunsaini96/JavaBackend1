package Collection.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(10);
        pq2.add(20);
        pq2.add(30);

        for(Integer i:pq2){
            pq1.add(i);
        }

        System.out.println(pq1);
        System.out.println(pq2);
    }
}
