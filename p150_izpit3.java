package Programing.basics;

import java.util.Scanner;

public class p150_izpit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double wheist = Double.parseDouble(scanner.nextLine());
        double hught = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());

        double total = 2 * lenght + 2 * wheist;
        double totalprice = total * price;
        double plosht = total * hught;
        double teglo = plosht * kg;
        System.out.printf("%s\n%.2f\n%.3f",(int)total,totalprice,teglo);
    }
}
