package Programing.basics;

import java.util.Scanner;

public class p52_Charrity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double days = Double.parseDouble(scanner.nextLine());
        double sweets = Double.parseDouble(scanner.nextLine());
        double cakes = Double.parseDouble(scanner.nextLine());
        double gufreti = Double.parseDouble(scanner.nextLine());
        double pancakes = Double.parseDouble(scanner.nextLine());

        double totalCakes = cakes * 45;
        double totalGufreti = gufreti * 5.80;
        double totalPancakes = pancakes * 3.20;
        double totalIncomeForDay = (totalCakes + totalGufreti + totalPancakes) * sweets;
        double totalReisd = totalIncomeForDay * days;
        double total = totalReisd - (totalReisd / 8);

        System.out.printf("%.2f",total);

    }
}
