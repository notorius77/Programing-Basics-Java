package Programing.basics;

import java.util.Scanner;

public class p106_EnterEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = Integer.parseInt(scanner.nextLine());
        int n = 0;
        while (true) {
            System.out.print("Enter even number; ");
            n = Integer.parseInt(scanner.nextLine());
            if ( n % 2 == 0) {
                break;
            }
            System.out.println("The number is not even. ");
        }
        System.out.println("Even number entered: " + n);
    }
}

