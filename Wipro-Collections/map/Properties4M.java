package map;

import java.util.*;

public class Properties4M {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.put("Andhra Pradesh", "Amaravati");
        p.put("Telangana", "Hyderabad");
        p.put("Karnataka", "Bengaluru");

        Iterator<Object> it = p.keySet().iterator();

        while (it.hasNext()) {
            String state = (String) it.next();
            System.out.println(state + " -> " + p.getProperty(state));
        }
    }
}
