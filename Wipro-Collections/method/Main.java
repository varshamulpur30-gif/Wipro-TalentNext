package method;

public class Main {

    public static void main(String[] args) {

        Factorial obj = new Factorial();
        MyFactorial mf = obj::factorial;

        int result = mf.calculate(5);

        System.out.println("Factorial = " + result);
    }
}
