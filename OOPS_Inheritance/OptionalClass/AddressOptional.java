package OptionalClass;

import java.util.Optional;

public class AddressOptional {

    public static void main(String[] args) {

        String address = null;

        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);
    }
}