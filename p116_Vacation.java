package Programing.basics;

import java.util.Scanner;

public class p116_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int adults = Integer.parseInt(scanner.nextLine());
        int kids = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String transportation = scanner.nextLine();

        double transportPrice = 0;
        double nightsPrice = 0;
        double comision = 0;
        double totalPrice = 0;
        if (transportation.equalsIgnoreCase("airplane")) {
            transportPrice = ((adults * 70 ) + (kids * 50)) * 2;
            nightsPrice = (double)nights * 82.99;
            comision = ((transportPrice + nightsPrice)) * 0.10;
            totalPrice = transportPrice + nightsPrice + comision;
        }
        else if (transportation.equalsIgnoreCase("train")) {
            transportPrice = ((adults * 24.99 ) + (kids * 14.99)) * 2;
            nightsPrice = (double)nights * 82.99;
            comision = (transportPrice + nightsPrice) * 0.10;
            totalPrice = transportPrice + nightsPrice + comision;
        }
        else if (transportation.equalsIgnoreCase("bus")){
            transportPrice = ((adults * 32.50 ) + (kids * 28.50)) * 2;
            nightsPrice = (double)nights * 82.99;
            comision = (transportPrice + nightsPrice) * 0.10;
            totalPrice = transportPrice + nightsPrice + comision;
        }
        else if (transportation.equalsIgnoreCase("boat")){
            transportPrice = ((adults * 42.99 ) + (kids * 39.99)) * 2;
            nightsPrice = (double)nights * 82.99;
            comision = (transportPrice + nightsPrice) * 0.10;
            totalPrice = transportPrice + nightsPrice + comision;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
