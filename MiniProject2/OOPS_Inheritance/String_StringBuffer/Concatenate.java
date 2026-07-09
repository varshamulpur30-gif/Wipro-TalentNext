package String_StringBuffer;

import java.util.Scanner;

public class Concatenate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String result;

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            result = s1 + s2.substring(1);
        } else {
            result = s1 + s2;
        }

        System.out.println(result.toLowerCase());

        sc.close();
    }
}