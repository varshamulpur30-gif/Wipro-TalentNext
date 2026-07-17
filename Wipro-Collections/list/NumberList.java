import java.util.*;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);
        list.add(12.5);
        list.add(23.45f);
        list.add(100L);

        System.out.println(list);
    }
}