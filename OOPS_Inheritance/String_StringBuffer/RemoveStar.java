package String_StringBuffer;

import java.util.Scanner;

public class RemoveStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int index = str.indexOf('*');

        if (index != -1) {
            String result = "";

            if (index > 0) {
                result += str.substring(0, index - 1);
            }

            if (index < str.length() - 2) {
                result += str.substring(index + 2);
            }

            System.out.println("Output: " + result);
        } else {
            System.out.println("Output: " + str);
        }

        sc.close();
    }
}