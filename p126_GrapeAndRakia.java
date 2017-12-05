package Programing.basics;

import java.util.Scanner;

public class p126_GrapeAndRakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double grapePerSqM = Double.parseDouble(scanner.nextLine());
        double junk = Double.parseDouble(scanner.nextLine());
        double production = area * grapePerSqM - junk;
        double rakia = 0.45 * production / 7.5;
        double grape = 0.55 * production;
        double rakiaProfit = rakia * 9.80;
        double grapeProfit = grape * 1.50;
        System.out.printf("%.2f%n", rakiaProfit);
        System.out.printf("%.2f", grapeProfit);
    }
}