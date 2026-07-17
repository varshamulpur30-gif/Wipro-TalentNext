package src;

import java.util.*;
import java.util.function.Predicate;

public class Predicate4S {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("apple");
        list.add("radar");
        list.add("hello");
        list.add("malayalam");
        list.add("cat");
        list.add("noon");
        list.add("dog");

        Predicate<String> p = s ->
                s.equals(new StringBuilder(s).reverse().toString());

        for (String s : list) {
            if (p.test(s))
                System.out.println(s);
        }
    }
}
