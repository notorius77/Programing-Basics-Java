package Programing.basics;

import java.util.Scanner;

public class p78_EnergyLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int a = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int energySum = 0;
        for (int i = 1; i <= n; i++) {
            int hours = Integer.parseInt(scanner.nextLine());

            if ( i % 2 == 0 && hours % 2 == 0){
                sum = a * 68;
            }else if ( i % 2 != 0 && hours % 2 == 0){
                sum = a * 49;
            }else if ( i % 2 == 0 && hours % 2 != 0){
                sum = a * 65;
            }else  {
                sum = a * 30;
            }
            energySum += sum;
        }
        double allDaysEnrgy = 100.0 * a * n;
        double leftEnergy = allDaysEnrgy -energySum;
        double energyPerDancer = leftEnergy/ a/ n ;
        double diff = 100 - energyPerDancer;
        if (diff < 50){
            System.out.printf("They feel good! Energy left: %.2f",energyPerDancer);
        }else {
            System.out.printf("They are wasted! Energy left: %.2f",energyPerDancer);
        }
    }
}
