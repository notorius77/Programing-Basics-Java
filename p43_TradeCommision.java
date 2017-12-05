package Programing.basics;

import java.util.Scanner;

public class p43_TradeCommision {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String town = scanner.nextLine();
            double sell = Double.parseDouble(scanner.nextLine());

            if ("Sofia".equalsIgnoreCase(town)) {
                if (sell >= 0 && sell <= 500) {
                    System.out.printf("%.2f", sell * 0.05);
                } else if (sell > 500 && sell <= 1000) {
                    System.out.printf("%.2f", sell * 0.07);
                } else if (sell > 1000 && sell <= 10000) {
                    System.out.printf("%.2f", sell * 0.08);
                } else if (sell > 10000) {
                    System.out.printf("%.2f", sell * 0.12);
                } else {
                    System.out.println("error");
                }
            } else if ("Varna".equalsIgnoreCase(town)) {
                if (sell >= 0 && sell <= 500) {
                    System.out.printf("%.2f", sell * 0.045);
                } else if (sell > 500 && sell <= 1000) {
                    System.out.printf("%.2f", sell * 0.075);
                } else if (sell > 1000 && sell <= 10000) {
                    System.out.printf("%.2f", sell * 0.10);
                } else if (sell > 10000) {
                    System.out.printf("%.2f", sell * 0.13);
                } else {
                    System.out.println("error");
                }
            } else if ("Plovdiv".equalsIgnoreCase(town)) {
                if (sell >= 0 && sell <= 500) {
                    System.out.printf("%.2f", sell * 0.055);
                } else if (sell > 500 && sell <= 1000) {
                    System.out.printf("%.2f", sell * 0.08);
                } else if (sell > 1000 && sell <= 10000) {
                    System.out.printf("%.2f", sell * 0.12);
                } else if (sell > 10000) {
                    System.out.printf("%.2f", sell * 0.145);
                } else {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }
        }
    }