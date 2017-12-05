package Programing.basics;

import java.util.Scanner;

public class p145_ChangeTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyRaised = Double.parseDouble(scanner.nextLine());
        double weist = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double triangleSide = Double.parseDouble(scanner.nextLine());
        double triangleHight = Double.parseDouble(scanner.nextLine());
        double oneBrickPrice = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());

        double totalFloar = weist * lenght;
        double totalBrick = triangleSide * triangleHight / 2;
        double neededBricks = totalFloar / totalBrick + 5;
        double totalPrice = ((Math.ceil(neededBricks)) * oneBrickPrice) + fee;
        if (moneyRaised >= totalPrice){
            double result = moneyRaised - totalPrice;
            System.out.printf("%.2f lv left.",result);
        }else if(moneyRaised < totalPrice){
            double result = totalPrice - moneyRaised;
            System.out.printf("You'll need %.2f lv more.",result);
        }
    }
}
