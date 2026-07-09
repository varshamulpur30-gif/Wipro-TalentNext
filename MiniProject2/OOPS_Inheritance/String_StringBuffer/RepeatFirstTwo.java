package String_StringBuffer;

import java.util.Scanner;

public class RepeatFirstTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result = result + firstTwo;
        }

        System.out.println(result);

        sc.close();
    }
}