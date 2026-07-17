package stream;
class Employee {

    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    void display() {
        System.out.println(empNo + " " + name + " " + age + " " + location);
    }
}