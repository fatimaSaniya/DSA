package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class BasicHeap {
    public static void main(String[] args) {

        //minHeap
        PriorityQueue q = new PriorityQueue<>();
        q.add(2); // T.C. -> O(log n), peek = O(1)
        System.out.println(q + " " + q.peek());
        q.add(10);
        System.out.println(q + " " + q.peek());
        q.add(1);
        System.out.println(q + " " + q.peek());
        q.remove(); // T.C. -> O(log n)
        System.out.println(q + " " + q.peek());
        q.add(0);
        System.out.println(q + " " + q.peek());
        System.out.println();

        //maxHeap
        PriorityQueue q1 = new PriorityQueue<>(Collections.reverseOrder());
        q1.add(2);
        System.out.println(q1 + " " + q1.peek());
        q1.add(10);
        System.out.println(q1 + " " + q1.peek());
        q1.add(1);
        System.out.println(q1 + " " + q1.peek());
        q1.remove();
        System.out.println(q1 + " " + q1.peek());
        q1.add(0);
        System.out.println(q1 + " " + q1.peek());
    }
}
