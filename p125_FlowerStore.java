package Programing.basics;

import java.util.Scanner;

public class p125_FlowerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double magnolii = Double.parseDouble(scanner.nextLine());
        double zumbili = Double.parseDouble(scanner.nextLine());
        double rozi = Double.parseDouble(scanner.nextLine());
        double kaktus = Double.parseDouble(scanner.nextLine());
        double podaruk = Double.parseDouble(scanner.nextLine());

        double magnoliiPrice = magnolii * 3.25;
        double zumbuliPrice = zumbili * 4;
        double roziPrice = rozi * 3.50;
        double kaktusi = kaktus * 8;

        double allmoney = magnoliiPrice + zumbuliPrice + roziPrice + kaktusi;
        double taxes = allmoney - ((allmoney * 5) / 100);

        if (taxes <= podaruk) {
            double left = podaruk - taxes;
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(left) );
        }else {
            double borrow = taxes - podaruk;
            System.out.printf("She is left with %.0f leva.", Math.floor(borrow));
        }
    }
}
