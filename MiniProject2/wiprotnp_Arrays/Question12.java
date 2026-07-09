public class Question12 {
    public static void main(String[] args) {

        int[] a = {7, 7, 7};
        int[] b = {3, 8, 0};

        int[] result = new int[2];

        result[0] = a[1];
        result[1] = b[1];

        System.out.println(result[0] + " " + result[1]);
    }
}