package lambda;
public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = str -> str.trim().split("\\s+").length;

        String s = "Java is an object oriented programming language";

        System.out.println("Number of words = " + wc.count(s));
    }
}