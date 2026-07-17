import java.util.*;

public class VectorEmployee {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<>();

        vector.add(new Employee(101,"Kavya","k@gmail.com",'F',45000));
        vector.add(new Employee(102,"Rahul","r@gmail.com",'M',50000));

        System.out.println("Using Iterator");

        Iterator<Employee> it = vector.iterator();

        while(it.hasNext()) {
            it.next().getEmployeeDetails();
            System.out.println();
        }

        System.out.println("Using Enumeration");

        Enumeration<Employee> en = vector.elements();

        while(en.hasMoreElements()) {
            en.nextElement().getEmployeeDetails();
            System.out.println();
        }
    }
}