package set;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Mango");
        ts.add("Grapes");

        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        String search = "Mango";

        if (ts.contains(search))
            System.out.println("\n" + search + " exists.");
        else
            System.out.println("\n" + search + " does not exist.");
    }
}
