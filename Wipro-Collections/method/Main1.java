package method;
public class Main1 {

    public static void main(String[] args) {

        MyDigitCount dc = DigitCount::digitCount;

        int result = dc.count(987654);

        System.out.println("Number of Digits = " + result);
    }
}