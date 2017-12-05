package Programing.basics;

import java.util.Scanner;

public class p80_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fullStadium = Integer.parseInt(scanner.nextLine());
        int allFans = Integer.parseInt(scanner.nextLine());

        double sumA = 0;
        double sumB= 0;
        double sumV = 0;
        double sumG = 0;

        for (int i = 1; i <= allFans ; i++) {
            String sector = scanner.nextLine().toLowerCase();
            if ("A".equalsIgnoreCase(sector)) {
                sumA++;
            } else if ("B".equalsIgnoreCase(sector)) {
                sumB++;
            } else if ("V".equalsIgnoreCase(sector)) {
                sumV++;
            } else if ("G".equalsIgnoreCase(sector)) {
                sumG++;
            }
        }
         double parcentAllFans = (double) allFans /(double) fullStadium* 100;
            System.out.printf("%.2f%%\n",sumA / (double) allFans * 100);
            System.out.printf("%.2f%%\n",sumB / (double) allFans * 100);
            System.out.printf("%.2f%%\n",sumV / (double) allFans * 100);
            System.out.printf("%.2f%%\n",sumG / (double) allFans * 100);
            System.out.printf("%.2f%%",parcentAllFans);
    }
}
