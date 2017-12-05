package Programing.basics;

import java.util.Scanner;

public class p113_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());

        int pice = wight * lenght;

        for (int i = 0; i <= 1000; i++) {
            String takePice = scanner.nextLine();

            if ("Stop".equalsIgnoreCase(takePice)) {
                System.out.printf("%d pieces are left.", pice);
                break;
            } else {
                pice -= Integer.valueOf(takePice);
                if (pice < 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pice));
                    break;
                }
            }
        }
    }
}
