package homework34.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {

    //
    public static int getAge(String birthDate) {
        // Homework
        LocalDate date = convertStringToLocalDate(birthDate);
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(date, today);
    }

    public static String[] sortStringDates(String[] dates) {
        // Homework
        String[] res = Arrays.copyOf(dates, dates.length); // копируем массив строк dates в массив строк res
        // получили массив строк, его имя res
        Arrays.sort(res, (d1, d2) -> convertStringToLocalDate(d1).compareTo(convertStringToLocalDate(d2))); // сортируем массив
        return res; // возвращаем отсортированный массив строк
    }

    // метод перегоняет массив строк в массив дат
    public static LocalDate[] convertStringsToDates(String[] dates){
        LocalDate[] res = new LocalDate[dates.length];
        for (int i = 0; i < dates.length; i++) {
            res[i] = convertStringToLocalDate(dates[i]);
        }
        return res;
    }

    private static LocalDate convertStringToLocalDate(String stringDate) {
        LocalDate res = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd][dd.MM.yyyy]"));

        return res;
    }

}
