package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kSortedArray {
    public static void main(String[] args) {
        //int[] arr = {6,3,5,2,8,10,9};
        int[] arr = {3,1,4,2,5};
        //int k =3;
        int k =2;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int ele: arr) {
            q.add(ele);
            if(q.size() > k) ans.add(q.remove());
        }
        while(q.size() > 0){
            ans.add(q.remove());
        }
        System.out.println(ans);
    }
}
