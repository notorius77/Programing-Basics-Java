package Programing.basics;

import java.util.Scanner;

public class p69_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int big = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > big){
                big = num;

            }

        }
        System.out.println(big);
    }
}
