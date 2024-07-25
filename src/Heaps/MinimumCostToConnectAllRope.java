package Heaps;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
public class MinimumCostToConnectAllRope {
    public static void main(String[] args) {
        int[] arr = {2,7,1,4,8};
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int ele: arr) {
            q.add(ele);
        }
        int cost = 0;
        while(q.size() > 1){
            int x = q.remove();
            int y = q.remove();
            cost+= x + y;
            q.add(x+y);
        }
        System.out.println(cost);
    }
}
