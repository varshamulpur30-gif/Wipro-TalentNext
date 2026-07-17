package src;

import java.util.*;
import java.util.function.Predicate;

public class Predicate6S {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(0, 1, 2, 4, 7, 9, 16, 20, 25, 36));

        Predicate<Integer> p = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };

        for (Integer n : list) {
            if (p.test(n))
                System.out.println(n);
        }
    }
}