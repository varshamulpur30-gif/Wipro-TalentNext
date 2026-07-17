import java.util.*;

public class EmployeeLinkedList {

    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(101,"Kavya","Kavya@gmail.com",'f',4500f));
        list.add(new Employee(102,"Rahul","r@gmail.com",'M',50000f));

        for(Employee e : list) {
            e.getEmployeeDetails();
            System.out.println();
        }
    }
}