package Programing.basics;

import java.util.Scanner;

public class p45_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double income = 0.0;
        if( type.equals("Premiere")){
         income = r * c * 12.00;
        }else if (type.equals("Normal")){
         income = r * c * 7.50;
        }else if (type.equals("Discount")){
         income = r * c * 5.00;
        }
        System.out.printf("%.2f leva", income);

    }
}
