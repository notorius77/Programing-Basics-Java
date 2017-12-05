package Programing.basics;//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p34_SleepeCatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        double daysOFFgame = days *127;
        double daysWorkGame = (365 - days) * 63;
        double gametime = daysOFFgame + daysWorkGame;

        int need = 0;
        int left = 0;
        int hours = 0;
        int min = 0;

        if( gametime <= 30000){
            left = 30000 - (int)gametime;
            hours = left/60;
            min = left % 60;
            System.out.printf("Tom sleeps well %n %d hours and %d minutes less for play",hours,min);
        }else {
            need = (int)gametime - 30000;
            hours = need/60;
            min = need % 60;
            System.out.printf("Tom will run away %n %d hours and %d minutes more for play",hours,min);
        }

    }
}

