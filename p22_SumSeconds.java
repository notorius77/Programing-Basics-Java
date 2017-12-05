package Programing.basics;

import java.util.Scanner;

public class p22_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int resultinSeconds = first + second + third;
        int minutes = resultinSeconds / 60;
        int seconds = resultinSeconds % 60;

        if (seconds<10) {
            System.out.printf("%s:0%s", minutes, seconds);
        } else {
            System.out.printf("%s:%s", minutes, seconds);
        }

    }

}




