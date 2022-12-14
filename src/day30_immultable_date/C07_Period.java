package day30_immultable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {


    public static void main(String[] args) {

        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1 = LocalDate.of(1989, 9, 14);

        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1, bugun );

        System.out.println(period); // P-50Y-6M-5D

        System.out.println(period.getYears());
    }
}