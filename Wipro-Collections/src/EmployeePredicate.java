package src;

import java.util.*;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(101, "Kavya", 9000));
        list.add(new Employee1(102, "Ram", 12000));
        list.add(new Employee1(103, "Ravi", 8000));
        list.add(new Employee1(104, "Anu", 15000));
        list.add(new Employee1(105, "Priya", 7000));

        Predicate<Employee1> p = e -> e.getSalary() < 10000;

        for (Employee1 e : list) {
            if (p.test(e))
                System.out.println(e.getName());
        }
    }
}