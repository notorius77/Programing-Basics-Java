package Programing.basics;

import java.util.Scanner;

public class p130_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double junior = Double.parseDouble(scanner.nextLine());
        double sinior = Double.parseDouble(scanner.nextLine());
        String road = scanner.nextLine();


         double entry = 0;
         double  tax = 0;
         double allRaised = 0;
        if ("trail".equalsIgnoreCase(road)) {
          entry = (junior * 5.5) + (sinior * 7);
          tax  = entry -((entry * 5)/ 100);
        }else if ("cross-country".equalsIgnoreCase(road)){
            entry = (junior * 8) + (sinior *9.50);
            if(junior + sinior >= 50){
                entry = entry - ((entry * 25)/100);
            }else {
                entry = entry;
            }
            tax = entry - ((entry * 5)/100);
        }else if ("downhill".equalsIgnoreCase(road)){
            entry = (junior *12.25) + (sinior *13.75);
            tax = entry - ((entry * 5)/100);
        }else if ("road".equalsIgnoreCase(road)){
            entry = (junior *20) + (sinior *21.50);
            tax = entry - ((entry * 5)/100);
        }
        System.out.printf("%.2f",tax);
    }
}
