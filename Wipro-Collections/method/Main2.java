package method;
public class Main2{

    public static void main(String[] args) {

        PrimeCheck pc = Prime::new;

        pc.check(17);
        pc.check(20);
    }
}