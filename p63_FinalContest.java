package Programing.basics;

import java.util.Scanner;

public class p63_FinalContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = scanner.nextLine();
        double money = points * dancers;
        double percent = 0;
        double amount = 0;
        double charity = 0;
        double moneyDancer = 0;

        if (season.equals("summer")) {
            if (country.equals("Bulgaria")) {
                percent = money * 0.05;
                amount = money - percent;
                charity = amount * 0.75;
                moneyDancer = (amount - charity) / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyDancer);

            }

        } else if (season.equals("winter")) {
            if (country.equals("Bulgaria")) {
                percent = money * 0.08;
                amount = money - percent;
                charity = amount * 0.75;
                moneyDancer = (amount - charity) / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyDancer);

            }

        }
        if (season.equals("summer")) {
            if (country.equals("Abroad")) {
                money = (points * dancers) + (money * 0.5);
                percent = money * 0.1;
                amount = money - percent;
                charity = amount * 0.75;
                moneyDancer = (amount - charity) / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyDancer);

            }

        } else if (season.equals("winter")) {
            if (country.equals("Abroad")) {
                money = (points * dancers) + (money * 0.5);
                percent = money * 0.15;
                amount = money - percent;
                charity = amount * 0.75;
                moneyDancer = (amount - charity) / dancers;
                System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyDancer);
            }

        }
    }
}
