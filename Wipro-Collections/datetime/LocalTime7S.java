package datetime;

import java.time.LocalTime;

public class LocalTime7S {

    public static void main(String[] args) {

        LocalTime current = LocalTime.now();

        LocalTime before = current.minusHours(5).minusMinutes(30);

        System.out.println("Current Time : " + current);
        System.out.println("Time Before 5 Hours 30 Minutes : " + before);
    }
}