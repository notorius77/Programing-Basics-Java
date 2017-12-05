package Programing.basics;

import java.util.Scanner;

public class p59_Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double step = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());
        double lerningDay = Double.parseDouble(scanner.nextLine());


        double DaysStep = Math.ceil((step / lerningDay) / step * 100);
        double DancerStep = (DaysStep / dancers);

        if (DaysStep <= 13){
            System.out.printf("Yes, they will succeed in that goal! %.2f%%. ",DancerStep);

        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", DancerStep);
        }
    }
}
