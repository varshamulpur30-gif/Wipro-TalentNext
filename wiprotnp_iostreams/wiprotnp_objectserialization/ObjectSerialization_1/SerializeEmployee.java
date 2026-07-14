import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeEmployee {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "Varsha",
                    new Date(),
                    "AI&DS",
                    "Student",
                    10000.0);

            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Employee object serialized successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}