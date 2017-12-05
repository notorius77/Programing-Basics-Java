package Programing.basics;

import java.util.Scanner;

public class p55_WorldSwimingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sec = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double oneMsec = Double.parseDouble(scanner.nextLine());

        double mustSwim = m * oneMsec;
        double addTime = Math.floor(m/ 15) * 12.5;
        double total = mustSwim + addTime;

        if (sec <= total) {
            double result = total - sec;
            System.out.printf("No, he failed! He was %.2f seconds slower.",result);
        }else if (sec > total){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",total);
        }
    }
}
