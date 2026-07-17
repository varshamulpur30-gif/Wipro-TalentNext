package datetime;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class LocalDate3S {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        LocalDate firstDayNextMonth = date.plusMonths(1).withDayOfMonth(1);

        LocalDate firstSunday = firstDayNextMonth.with(
                TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of Next Month : " + secondSunday);
    }
}
