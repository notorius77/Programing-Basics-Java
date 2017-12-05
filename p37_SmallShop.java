package Programing.basics;

import java.util.Scanner;

public class p37_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice = 0;

        if ("Sofia".equals(town)) {
            if ("coffee".equals(product)) {
                productPrice = 0.50;
            } else if ("water".equals(product)) {
                productPrice = 0.80;
            } else if ("beer".equals(product)) {
                productPrice = 1.20;
            } else if ("sweets".equals(product)) {
                productPrice = 1.45;
            } else if ("peanuts".equals(product)) {
                productPrice = 1.60;
            }
        } else if ("Plovdiv".equals(town)) {
            if ("coffee".equals(product)) {
                productPrice = 0.40;
            } else if ("water".equals(product)) {
                productPrice = 0.70;
            } else if ("beer".equals(product)) {
                productPrice = 1.15;
            } else if ("sweets".equals(product)) {
                productPrice = 1.30;
            } else if ("peanuts".equals(product)) {
                productPrice = 1.50;
            }
        } else if ("Varna".equals(town)) {
            if ("coffee".equals(product)) {
                productPrice = 0.45;
            } else if ("water".equals(product)) {
                productPrice = 0.70;
            } else if ("beer".equals(product)) {
                productPrice = 1.10;
            } else if ("sweets".equals(product)) {
                productPrice = 1.35;
            } else if ("peanuts".equals(product)) {
                productPrice = 1.55;
            }
        }
        double totalPrice = productPrice * quantity;
        System.out.println(totalPrice);
    }
}