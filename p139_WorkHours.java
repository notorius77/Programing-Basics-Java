package Programing.basics;

import java.util.Scanner;

public class p139_WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hoursNeeded = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double  workingDays = Double.parseDouble(scanner.nextLine());

        double totalWork = workers * workingDays * 8;
        double result = totalWork - hoursNeeded;
        double penalties = result * workingDays;
        if ( hoursNeeded <= totalWork){
            System.out.printf("%s hours left",(int)result);
        }else if (hoursNeeded > totalWork){
            System.out.printf("%s overtime\nPenalties: %s",Math.abs((int)result),Math.abs((int)penalties));
        }
    }
}
