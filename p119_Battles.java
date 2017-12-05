package Programing.basics;

import java.util.Scanner;

public class p119_Battles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerOne = Integer.parseInt(scanner.nextLine());
        int playerTwo = Integer.parseInt(scanner.nextLine());
        int totalFights = Integer.parseInt(scanner.nextLine());
        int countMe = 0;

        for (int i = 1; i <= playerOne; i++) {
            for (int j = 1; j <= playerTwo; j++) {
                countMe++;
                if (countMe > totalFights) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j );
            }
        }
    }
}