package kg.megacom;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static String Moscow = "Europe/Moscow";
    static String Minsk = "Europe/Minsk";
    static String Tunis = "Africa/Tunis";
    static String Chicago = "America/Chicago";

    public static void main(String[] args) {

        System.out.println("Выберите город:");
        System.out.println("1 - Москва\n2 - Минск\n3 - Тунис\n4 - Чикаго");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String zone;

        switch (i) {
            case (1):
                zone = Moscow;
                break;
            case (2):
                zone = Minsk;
                break;
            case (3):
                zone = Tunis;
                break;
            case (4):
                zone = Chicago;
                break;
            default:
                System.out.println("город не найден, смотрите Московское время");
                zone = Moscow;
                break;
        }


        System.out.print(zone + "\n");
        while (true) {
            ZonedDateTime date = ZonedDateTime.now(ZoneId.of(zone));
            DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
            String parsed = pattern.format(date);

            System.out.print("\r" + parsed);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
