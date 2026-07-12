public class Student {
    String name;
    int[] marks = new int[3];

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double average() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }
}