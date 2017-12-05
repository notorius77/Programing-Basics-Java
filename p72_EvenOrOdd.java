package Programing.basics;

import java.util.Scanner;

public class p72_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                    even = num + even;
            }else{
                odd = num + odd;
            }
        }
           if (even == odd){
            System.out.printf("Yes,%nSum = %d", even);
           }else {
               System.out.printf("No,%nDiff = %d", Math.abs(even - odd));
           }
        }
    }


