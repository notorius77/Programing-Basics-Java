package Programing.basics;

import java.util.Scanner;

public class p104_SumAllNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        do {
         int lastDiget = n % 10;
         sum = sum + lastDiget;
         n = n / 10;
        }while (n > 0);

        System.out.println(sum);
    }
}
