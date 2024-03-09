package JavaCourse.Algorithms;

import java.time.LocalDate;
import java.time.Period;

public class savedem {

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1990, 5, 15);

        LocalDate conferenceDate = LocalDate.of(2025, 3, 7);

        LocalDate currentDate = LocalDate.now();

//        int age = Period.between(birthDate, conferenceDate).getYears();

        int diff = Period.between(conferenceDate, currentDate).getYears();

        System.out.println(diff);

    }
}
