package ss8_set_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    static void main() {
        Map<String, Student> map = new HashMap<>();

        map.put("S001", new Student(1, "John", 3.2));
        map.put("S002", new Student(1, "Lily", 2.3));
        map.put(null, new Student(1, "Null Null", 2.3));

        //way 2
        Set<String> set = map.keySet();

        for(String key : set) {
            System.out.println(key + " - " + map.get(key));
        }


//        if(!map.containsKey("John")) {
//            map.put("John", 200);
//        }
        // way 1
//        for(Map.Entry<String, Student> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
    }
}
