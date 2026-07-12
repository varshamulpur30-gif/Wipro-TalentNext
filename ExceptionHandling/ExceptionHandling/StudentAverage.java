import java.util.Scanner;

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.next();

                int[] marks = new int[3];

                for (int j = 0; j < 3; j++) {

                    System.out.println("Enter Mark " + (j + 1) + ":");
                    marks[j] = Integer.parseInt(sc.next());

                    if (marks[j] < 0)
                        throw new NegativeMarksException("Negative Marks are not allowed.");

                    if (marks[j] > 100)
                        throw new OutOfRangeException("Marks should be between 0 and 100.");
                }

                Student s = new Student(name, marks);

                System.out.println("Average Marks of " + name + " = " + s.average());
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Enter only integers.");
        } catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}