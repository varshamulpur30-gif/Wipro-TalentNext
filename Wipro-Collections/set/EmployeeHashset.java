package set;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashset {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Kavya");
        employees.add("Rahul");
        employees.add("Anil");
        employees.add("Sneha");
        employees.add("Ravi");

        System.out.println("Employee Names:");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}