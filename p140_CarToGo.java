package Programing.basics;

import java.util.Scanner;

public class p140_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        if (budget < 100) {
            if ("summer".equalsIgnoreCase(season)) {
                price = (budget * 35) / 100;
                System.out.printf("Economy class\nCabrio - %.2f", price);
            } else if ("winter".equalsIgnoreCase(season))
                price = (budget * 65) / 100;
            System.out.printf("Economy class\nJeep - %.2f", price);
        } else if (budget > 100 && budget <= 500) {
            if ("summer".equalsIgnoreCase(season)) {
                price = (budget * 45) / 100;
                System.out.printf("Compact class\nCabrio - %.2f", price);
            } else if ("winter".equalsIgnoreCase(season))
                price = (budget * 80) / 100;
            System.out.printf("Compact class\nJeep - %.2f", price);
        } else if (budget > 500) {
            if ("summer".equalsIgnoreCase(season)) {
                price = (budget * 90) / 100;
                System.out.printf("Luxury class\nJeep - %.2f", price);
            } else if ("winter".equalsIgnoreCase(season)) {
                price = (budget * 90) / 100;
                System.out.printf("Luxury class\nJeep - %.2f", price);
            }
        }
    }
}