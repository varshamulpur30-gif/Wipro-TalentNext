public class Question10 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];

        int index = 0;

        // Add even numbers first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Add odd numbers next
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}