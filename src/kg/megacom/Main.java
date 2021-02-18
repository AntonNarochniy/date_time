package kg.megacom;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static LocalDate ZonedDate;

    public static void main(String[] args) {
        // Получаю текущую дату - с повышенной точностью до наносекунд
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата : " + today);

        // Получаю текущее время
        LocalTime time = LocalTime.now();
        System.out.println("Получаю текущее время : " + time);

        // Получаю текущее время и дату
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Получаю текущую дату и время : " + dateTime);

        //Создаю кастомное LocalTime со своими парамерами
        LocalTime myTime = LocalTime.of(23, 15, 11, 22);
        System.out.println("Кастомное время: "+ myTime);

        //Сравниваю позже ли текущее время чем кастомное время
        System.out.println("Сравниваю позже ли текущее время чем кастомное время: "+ time.isAfter(myTime));

        //Сравниваю раньше ли текущее время чем кастомное время
        System.out.println("Сравниваю раньше ли текущее время чем кастомное время: " + time.isBefore(myTime));

        //Сравниваю текущее время и каcтомное время
        System.out.println("Сравниваю текущее время и каcтомное время: " + time.equals(myTime));

        //Проверяю текущий год на високосность
        System.out.println("Год " + today.getYear() + " - високосный? : " + today.isLeapYear());

        //Операции + и - с датами
        System.out.println("\n9 дней после сегодняшнего дня будет: " + today.plusDays(9));
        System.out.println("3 недели после сегодняшнего дня будет: " + today.plusWeeks(3));
        System.out.println("20 месяцев после сегодняшнего дня будет: " + today.plusMonths(20));

        System.out.println("9 дней до сегодняшнего дня будет: " + today.minusDays(9));
        System.out.println("3 недели до сегодняшнего дня будет: " + today.minusWeeks(3));
        System.out.println("20 месяцев до сегодняшнего дня будет: " + today.minusMonths(20));

        //Операции + и - с временем
        System.out.println("\nтекущее время + 3 часа: " + time.plusHours(3));
        System.out.println("текущее время + 1000 минут: " + time.plusMinutes(1000));
        System.out.println("текущее время + 60 секунд: " + time.plusSeconds(60));

        System.out.println("текущее время - 3 часа: " + time.minusHours(3));
        System.out.println("текущее время - 1000 минут: " + time.minusMinutes(1000));
        System.out.println("текущее время - 60 секунд: " + time.minusSeconds(60));

        // А теперь поиграемся с датой
        System.out.println("Первый день этого месяца : " + today.with(TemporalAdjusters.firstDayOfMonth()));
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("Последний день этой года : " + lastDayOfYear);

        Period period = today.until(lastDayOfYear);
        System.out.println("до конца года : " + period);
        System.out.println("В этом году осталось " + period.getMonths() + " месяц(ев)");

        // создаю ZonedDateTime - отображает временную зону
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("местное время:"+  now);

















    }
}
