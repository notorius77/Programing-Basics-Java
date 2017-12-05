package Programing.basics;

import java.util.Scanner;

public class p146_DIstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startSpeed = Integer.parseInt(scanner.nextLine());
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        double distance1 = startSpeed * firstTime;
        double distance2 = (startSpeed + ((startSpeed * 10)/100)) * secondTime;
        double distance3 = (startSpeed + ((startSpeed * 5)/100)) * thirdTime;

        double total = (distance1 + distance2 + distance3) * 0.016;
        System.out.printf("%.2f",total);
    }
}
