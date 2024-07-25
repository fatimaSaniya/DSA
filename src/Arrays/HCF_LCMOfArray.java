package Arrays;


import java.util.HashMap;
import java.util.Map;

public class HCF_LCMOfArray {
    public static void main(String[] args) {
        int []a = {2,10,4,6};
        int lcm = 1;
        Map<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j <a[i]; j++) {
                if(a[i]%j == 0) set.put(j, set.getOrDefault(j+1,1));
            }
        }
        for (int i = 0; i < set.size() ; i++) {
            //lcm*=set.
        }
        System.out.println(set);
    }
}
