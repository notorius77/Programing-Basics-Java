package Programing.basics;

import java.util.Scanner;

public class p124_HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double smallestRoom = Double.parseDouble(scanner.nextLine());
        double kitchen = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        String sss = "";

        double secondRoom = smallestRoom + ((smallestRoom * 10 )/ 100);
        double thirdRoom = secondRoom + ((secondRoom * 10) / 100);
        double bathRoom = smallestRoom / 2;

        double house = smallestRoom + kitchen + secondRoom + thirdRoom + bathRoom ;
        double totalHouse = house +((house * 5) / 100);
        double totalPrice = totalHouse * price;
        System.out.printf("%.2f",totalPrice);
    }
}
