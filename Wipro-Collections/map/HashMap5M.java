package map;

import java.util.*;

public class HashMap5M {

    public static void main(String[] args) {

        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Kavya", 123456);
        contactList.put("Ram", 654321);
        contactList.put("Ravi", 987654);
        System.out.println(contactList.containsKey("Ram"));

        System.out.println(contactList.containsValue(987654));
        Iterator<Map.Entry<String, Integer>> it = contactList.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
