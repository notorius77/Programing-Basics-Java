package Programing.basics;

import java.util.Scanner;

public class p49_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lenght = Double.parseDouble(scanner.nextLine());
        double weist = Double.parseDouble(scanner.nextLine());
        double haight = Double.parseDouble(scanner.nextLine());
        double parcent = Double.parseDouble(scanner.nextLine());

        double obem = lenght * weist * haight;
        double liters = obem * 0.001;
        double parcents = parcent * 0.01;
        double totalLiters = liters * (1 - parcents);

        System.out.printf("%.3f" ,totalLiters);
    }
}
