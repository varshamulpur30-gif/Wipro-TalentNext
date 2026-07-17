package lambda;

import java.util.*;

public class LambdaExpressions4M {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Cat");
        al.add("Dog");
        al.add("Elephant");
        al.add("Flower");
        al.add("Goat");
        al.add("House");
        al.add("India");
        al.add("Java");

        al.forEach(s -> {
            if (s.length() % 2 != 0)
                System.out.println(s);
        });
    }
}
