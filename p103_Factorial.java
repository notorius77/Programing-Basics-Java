package Programing.basics;

import java.util.Scanner;

public class p103_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int fact = 1;

        do {
            fact = fact * n ;
            // if (n == 0){
            // n = 1; }---- tova e su6toto kato ternarniq operator gore
            n--;
        } while (n > 0);

        System.out.println(fact);
    }
}
