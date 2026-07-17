public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Kavya", "kavya@gmail.com",'F',4500f);

        Employee e2 = new Employee(102, "lalasa", "lalasaa@gmail.com",'F',3500f);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.getEmployeeDetails();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);
    }
}