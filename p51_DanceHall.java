package Programing.basics;

import java.util.Scanner;

public class p51_DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L = Double.parseDouble(scanner.nextLine());
        double W = Double.parseDouble(scanner.nextLine());
        double A = Double.parseDouble(scanner.nextLine());

        double Hall = (L * 100) * (W * 100);
        double Dresser = (A * 100) * (A * 100);
        double Bench = Hall / 10 ;
        double FreeSpace = Hall - Dresser - Bench;
        double totalDencers = FreeSpace / (40 + 7000);

        System.out.printf("%.0f", Math.floor(totalDencers));
     }
}
