import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 20, 40};

        Arrays.sort(arr);

        System.out.println("Smallest 2 numbers: " + arr[0] + " " + arr[1]);
        System.out.println("Largest 2 numbers: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}