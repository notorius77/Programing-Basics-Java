package Programing.basics;

import java.util.Scanner;

public class p60_ToysShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double sum = puzzle*2.60 + doll*3 + teddyBear*4.10 + minion*8.20 + truck*2;
        int toysQuantity = puzzle + doll + teddyBear + minion + truck;

        if (toysQuantity >= 50){
            double totalPrice = sum - sum*0.25;
            double naem = 0.1 * totalPrice;
            double profit = totalPrice - naem;
            double moneyLeft = profit - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double naem = 0.1 * sum;
            double profit = sum - naem;
            double moneyLeft = Math.abs(tripPrice - profit);
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }


    }
}