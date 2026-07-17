package stream;

import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Kavya", 80));
        list.add(new Student(2, "Rahul", 45));
        list.add(new Student(3, "Sneha", 60));
        list.add(new Student(4, "Ravi", 30));
        list.add(new Student(5, "Anil", 75));
        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed = " + count);
    }
}
