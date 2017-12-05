package Programing.basics;

import java.util.Scanner;

public class p46_VolleyBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leapOrNormal = scanner.nextLine();
        int holidayYear = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());

        int weekendSofia = 48-weekendsHome;
        double saturdayGamesSofia = weekendSofia*(3.0/4.0);
        double holidayGamesSofia = holidayYear*(2.0/3.0);
        double allGame = saturdayGamesSofia+holidayGamesSofia+weekendsHome;

        if ("leap".equalsIgnoreCase(leapOrNormal)) {
            allGame += allGame*0.15;
        }
        System.out.printf("%.0f", Math.floor(allGame));
    }
}