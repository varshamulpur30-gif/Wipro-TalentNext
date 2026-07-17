package datetime;
import java.time.LocalDate;
import java.time.Period;

public class LocalDate4M {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2022, 7, 15);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience:");
        System.out.println(experience.getYears() + " Years "
                + experience.getMonths() + " Months "
                + experience.getDays() + " Days");
    }
}