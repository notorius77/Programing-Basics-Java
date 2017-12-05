package Programing.basics;

import java.util.Scanner;

public class p120_OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutestime = Integer.parseInt(scanner.nextLine());
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());

        int time = hours * 60 + minutestime;
        int studentTime = time1 * 60 + time2;


        if (studentTime > time) {
            System.out.println("Late");
            if (studentTime - time >= 60) {
                int timeDif = studentTime - time;
                int hour = timeDif / 60;
                int minutes = timeDif - hour * 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", studentTime - time);
            }
        } else if (time >= studentTime && time - studentTime <= 30) {
            System.out.println("On time");
            if (time != studentTime) {
                System.out.printf("%d minutes before the start", time - studentTime);
            }
        } else {
            System.out.println("Early");
            if (time - studentTime >= 60) {
                int timeDiff = time - studentTime;
                int hour = timeDiff / 60;
                int minutes = timeDiff - hour * 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            } else {
                System.out.printf("%d minutes before the start", time - studentTime);
            }
        }
    }
}