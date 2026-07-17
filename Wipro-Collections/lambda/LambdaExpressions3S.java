package lambda;

import java.util.*;

public class LambdaExpressions3S {

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

        al.forEach(s ->
            System.out.println(new StringBuilder(s).reverse())
        );
    }
}
