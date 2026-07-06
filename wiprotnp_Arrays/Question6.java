import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {

        int[] arr = {34, 12, 45, 67, 89};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}