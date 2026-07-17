package map;

import java.util.*;

public class HashMap3M {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Kavya");
        map.put("102", "Ram");
        map.put("103", "Ravi");

        System.out.println(map.containsKey("101"));
        System.out.println(map.containsValue("Ram"));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}