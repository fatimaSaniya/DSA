package HashMap;
import java.util.TreeMap;
public class BasicTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Saniya" , 54);
        map.put("Shivi" , 60);
        map.put("Sakshi" , 49);

        //iterate using for each loop
        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
