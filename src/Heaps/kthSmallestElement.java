package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,8,4,14,1,9,20};
        int k = 4;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele: arr) {
            q.add(ele);
            if(q.size() > k) q.remove();
        }
        System.out.println(q.peek());
    }
}
