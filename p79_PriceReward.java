package Programing.basics;

import java.util.Scanner;

public class p79_PriceReward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double parts = Double.parseDouble(scanner.nextLine());
        double moneyForOnePoint = Double.parseDouble(scanner.nextLine());
        double totalpoints = 0;
        double price = 0.0;
        double pointsEven = 0;
        double pointsOdd = 0;
        for (int i = 1; i <= parts; i++) {
            double points = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0 ) {
                pointsEven += (points * 2);
            }else {
                pointsOdd += points;
            }
            totalpoints = pointsEven + pointsOdd;
        }
        price = moneyForOnePoint * totalpoints;
        System.out.printf("The project prize was %.2f lv.",price);
    }
}
