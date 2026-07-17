package map;
import java.util.*;

public class CountryCapital {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }
    public String getCapital(String country) {
        return M1.get(country);
    }
    public String getCountry(String capital) {
        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equals(capital))
                return e.getKey();
        }
        return null;
    }
    public HashMap<String, String> swapMap() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }
        return M2;
    }
    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        CountryCapital obj = new CountryCapital();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Map M1 : " + obj.M1);

        System.out.println("Capital of India : " + obj.getCapital("India"));

        System.out.println("Country of Tokyo : " + obj.getCountry("Tokyo"));

        System.out.println("Map M2 : " + obj.swapMap());

        System.out.println("Country List : " + obj.getCountryList());
    }
}
