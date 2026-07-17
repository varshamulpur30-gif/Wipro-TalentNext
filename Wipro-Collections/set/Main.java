package set;

public class Main {

    public static void main(String[] args) {

        Country c = new Country();

        c.saveCountryNames("India");
        c.saveCountryNames("USA");
        c.saveCountryNames("Japan");
        c.saveCountryNames("Australia");

        System.out.println("Countries : " + c.H1);

        String result = c.getCountry("India");

        if (result != null)
            System.out.println("Country Found : " + result);
        else
            System.out.println("Country Not Found");
    }
}