package Programing.basics;

import java.util.Scanner;

public class p57_RemontPlochki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double o = Double.parseDouble(scanner.nextLine());

        double obshtaPlosht = n * n;
        double peika = m * 2;
        double ploshtZaPokrivane = obshtaPlosht - peika;
        double plochki = w * l ;
        double totalneeded = ploshtZaPokrivane / plochki;
        double totalTime = totalneeded * 0.2;

        System.out.println(Math.abs(totalneeded));
        System.out.println(Math.abs(totalTime));
    }
}
