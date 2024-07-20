package WorkShopQuestions;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KMostFrequentEle {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
//        for (int i = 0; i < arr.length ; i++) {
//            count = 0;
//            for (int j = i; j < arr.length && count<=k; j++) {
//                if(arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if(count == k) System.out.println(arr[i]+" appears "+k+" times");
//        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: arr) {
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num, map.get(num)+1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        q.addAll(map.entrySet());
        for (int i = 0; i < k ; i++) {
            System.out.println(q.poll().getKey());
        }
    }
}