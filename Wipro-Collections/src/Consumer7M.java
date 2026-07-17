package src;

import java.util.*;
import java.util.function.Consumer;

public class Consumer7M {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cat", "dog", "elephant",
                "flower", "goat", "house", "india", "java"));

        Consumer<ArrayList<String>> c = l -> {
            for (int i = 0; i < l.size(); i++) {
                l.set(i, new StringBuilder(l.get(i)).reverse().toString());
            }
        };

        c.accept(list);

        System.out.println(list);
    }
}
