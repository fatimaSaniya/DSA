package HashMap;
import java.util.HashMap;
import java.util.Objects;

public class BasicMap {
    public static void main(String[] args) {

        //unique keys only and duplicate values are possible
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Saniya" , 54);
        map.put("Shivi" , 60);

        //direct printing
       // System.out.println(map);

        //size of map
//        System.out.println(map.size());
//
//        // search by key
//        System.out.println(map.containsKey("Saniya"));
//        System.out.println(map.containsKey("Sakshi"));
//
//        // search by value
//        System.out.println(map.containsValue(54));
//        System.out.println(map.containsValue(57));
//
//        //get in map
//        System.out.println(map.get("Saniya"));

        //find
        

        //entry set

        //iterate using for each loop
        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();
        for (Integer val : map.values()) {
            System.out.println(val);
        }
        System.out.println();
        for (Object key: map.entrySet()) {
            System.out.println(key);
        }

        //remove
        map.remove("Shivi");
        //System.out.println(map);

    }
}
