package String_StringBuffer;

import java.util.Scanner;

public class RemoveFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() > 2) {
            System.out.println(str.substring(1, str.length() - 1));
        } else {
            System.out.println("");
        }

        sc.close();
    }
}