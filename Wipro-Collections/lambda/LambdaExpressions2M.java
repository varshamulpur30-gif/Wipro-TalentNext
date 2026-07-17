package lambda;
import java.util.*;

public class LambdaExpressions2M {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 25; i++) {
            al.add(r.nextInt(100) + 1);
        }

        System.out.println("Numbers: " + al);

        System.out.println("Prime Numbers:");

        al.forEach(n -> {
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    c++;
            }
            if (c == 2)
                System.out.print(n + " ");
        });
    }
}