package src;
import java.util.*;
import java.util.function.Function;

public class Function2S {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Kavya", "Hyderabad", 25000));
        list.add(new Employee(102, "Ram", "Chennai", 30000));
        list.add(new Employee(103, "Ravi", "Delhi", 35000));
        list.add(new Employee(104, "Anu", "Mumbai", 28000));
        list.add(new Employee(105, "Priya", "Bangalore", 40000));

        Function<ArrayList<Employee>, ArrayList<String>> f = empList -> {

            ArrayList<String> locations = new ArrayList<>();

            for (Employee e : empList)
                locations.add(e.getLocation());

            return locations;
        };

        System.out.println(f.apply(list));
    }
}