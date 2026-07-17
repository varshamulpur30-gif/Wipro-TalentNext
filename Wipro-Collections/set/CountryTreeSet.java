package set;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();
    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }
    public String getCountry(String countryName) {

        for (String country : T1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            } 
        }

        return null;
    }
}
