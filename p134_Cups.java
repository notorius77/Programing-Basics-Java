package Programing.basics;

import java.util.Scanner;

public class p134_Cups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cups = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());
        double workingDays = Double.parseDouble(scanner.nextLine());

        double workingHours = workers  * workingDays * 8;
        double cupsMade = workingHours / 5;
        if (cupsMade < cups) {
            double result = cups - cupsMade;
            double losses = result * 4.2;
            System.out.printf("Losses: %.2f",losses);
        }else if (cupsMade >= cups) {
            double result = cupsMade - cups;
            double extra =Math.floor(result) * 4.2;
            System.out.printf("%.2f extra money",extra);
        }
    }
}
