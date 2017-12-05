package Programing.basics;

import java.util.Scanner;

public class p128_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double income = 0;
        if ("Autumn".equalsIgnoreCase(season)
                || "Fall".equalsIgnoreCase(season)
                || "Spring".equalsIgnoreCase(season)) {
            if(km <= 5000) {
                income = km * 0.75;
            }else if ( km > 5000 && km <= 10000){
                income = km * 0.95;
            }else if (km > 10000 && km <= 20000 ) {
                income = km * 1.45;
            }
        }else if ("Summer".equalsIgnoreCase(season)){
            if(km <= 5000) {
                income = km * 0.90;
            }else if ( km > 5000 && km <= 10000){
                income = km * 1.10;
            }else if (km > 10000 && km <= 20000 ) {
                income = km * 1.45;
            }
        }else if ("Winter".equalsIgnoreCase(season)){
            if(km <= 5000) {
                income = km * 1.05;
            }else if ( km > 5000 && km <= 10000){
                income = km * 1.25;
            }else if (km > 10000 && km <= 20000 ) {
                income = km * 1.45;
            }
        }
        double incomeAllseason = income * 4;
        double incomeTax = incomeAllseason - ((incomeAllseason * 10)/ 100);
        System.out.printf("%.2f",incomeTax);
    }
}
