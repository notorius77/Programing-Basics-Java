package Programing.basics;

import java.time.DayOfWeek;
import java.util.Scanner;

public class p43_DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        switch (num){
            case 1 :
                System.out.println(DayOfWeek.MONDAY);
                break;
            case 2 :
                System.out.println(DayOfWeek.TUESDAY);
                break;
            case 3 :
                System.out.println(DayOfWeek.WEDNESDAY);
                break;
            case 4 :
                System.out.println(DayOfWeek.THURSDAY);
                break;
            case 5 :
                System.out.println(DayOfWeek.FRIDAY);
                break;
            case 6 :
                System.out.println(DayOfWeek.SATURDAY);
                break;
            case 7 :
                System.out.println(DayOfWeek.SUNDAY);
                break;
                default:
                    System.out.println("Error");
        }
    }
}