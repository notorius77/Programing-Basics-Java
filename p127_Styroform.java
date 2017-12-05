package Programing.basics;

import java.util.Scanner;

public class p127_Styroform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double house = Double.parseDouble(scanner.nextLine());
        double windows = Double.parseDouble(scanner.nextLine());
        double squareFeetStyroform = Double.parseDouble(scanner.nextLine());
        double styroformPrice = Double.parseDouble(scanner.nextLine());

        double totalHouse = house - windows * 2.4;
        double fira = totalHouse + ((totalHouse * 10) / 100);
        double howMany = fira / squareFeetStyroform;
        double resultStyro = Math.ceil(howMany) * styroformPrice;

        if (resultStyro <= budget) {
            double budgetLeftNeed = budget - resultStyro;
            System.out.printf("Spent: %.2f\nLeft: %.2f", resultStyro, budgetLeftNeed);
        }else if (resultStyro > budget) {
            double budgetNeed = resultStyro - budget;
            System.out.printf("Need more: %.2f", budgetNeed);
        }
    }
}
