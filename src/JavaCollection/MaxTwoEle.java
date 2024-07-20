package JavaCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
public class MaxTwoEle {
    public static void main(String[] args) {
        Integer[] arr = {6, 20, 4, 18, 21, 50, 5, 8, 10};
        List<Integer> list = Arrays.asList(arr);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(list);
        System.out.println(maxHeap.poll() + "  " + maxHeap.poll());
    }
}
