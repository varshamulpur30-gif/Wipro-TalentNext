import java.util.*;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<>();

        vector.add(new Employee(101,"Kavya","k@gmail.com",'F',45000f));
        vector.add(new Employee(102,"Rupa","r@gmail.com",'F',50000f));

        for(Employee e : vector) {
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}