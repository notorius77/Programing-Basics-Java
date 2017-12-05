package Programing.basics;

import java.util.Scanner;

public class p105_ChekPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

       boolean prime = true;

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
           if ( n % i == 0){
               prime = false;
               break;
           }
        }
        if (prime) {
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
