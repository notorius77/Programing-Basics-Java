package Programing.basics;

import java.util.Scanner;

public class p32_TransportPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Integer.parseInt(scan.nextLine());
        String hour = scan.nextLine();

        double taxiday = n*0.79+0.70;
        double taxinight = n*0.90 + 0.70;
        double autobus = n*0.09;

        double train = n*0.06;

        if (n<=19&& hour.equals("day"))
            System.out.printf("taxiday = %.2f\n", taxiday);
        else if (n<=19&& hour.equals("night"))
            System.out.printf("taxinight = %.2f\n", taxinight);
        else if (n<=99 && hour.equals("day")&& taxiday<autobus)
            System.out.printf("taxiday = %.2f\n", taxiday);
        else if (n<=99 && hour.equals("day")&& taxiday>autobus)
            System.out.printf("autobus = %.2f\n", autobus);
        else if (n<=99 && hour.equals("night")&& taxiday<autobus)
            System.out.printf("taxinight = %.2f\n", taxinight);
        else if (n<=99 && hour.equals("night")&& taxiday>autobus)
            System.out.printf("autobus = %.2f\n", autobus);
        else if (n>=100 && hour.equals("day") && taxiday<autobus && taxiday<train)
            System.out.printf("taxiday = %.2f\n", taxiday);
        else if (n>=100 && hour.equals("day") && taxiday>autobus && taxiday>train && autobus<train)
            System.out.printf("autobus = %.2f\n", autobus);
        else if (n>=100 && hour.equals("day") && taxiday>autobus && taxiday>train && autobus>train)
            System.out.printf("train = %.2f\n", train);

        else if (n>=100 && hour.equals("night") && taxiday<autobus && taxiday<train)
            System.out.printf("taxinight = %.2f\n", taxinight);
        else if (n>=100 && hour.equals("night") && taxiday>autobus && taxiday>train && autobus<train)
            System.out.printf("autobus = %.2f\n", autobus);
        else if (n>=100 && hour.equals("night") && taxiday>autobus && taxiday>train && autobus>train)
            System.out.printf("train = %.2f\n", train);




    }
}



