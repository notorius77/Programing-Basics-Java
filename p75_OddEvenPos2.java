package Programing.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p75_OddEvenPos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        double n = Double.parseDouble(scanner.nextLine());
        double evenSum = 0.0;
        double eveneMin = 1000000000.0;
        double evenMax =-1000000000.0 ;
        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax =-1000000000.0;

        for (int i = 1; i <= n  ; i++) {
           double current = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0){
                evenSum += current;
                if(current < eveneMin){
                    eveneMin = current;
                }
                if(current > evenMax){
                    evenMax = current;
                }
            }else {
                oddSum += current;
                if ( current < oddMin){
                    oddMin = current;
                }
                if (current > oddMax) {
                    oddMax = current;
                }
            }
        }
        System.out.printf("OddSum = %s ,",df.format(oddSum));
        if(oddMin == 1000000000.0){
            System.out.printf("OddMin = No ");
        }else {
            System.out.printf("OddMin = %s%n",df.format(oddMin));
        }
        if(oddMax == -1000000000.0){
            System.out.printf("OddMax = No ");
        }else {
            System.out.printf("OddMax = %s%n",df.format(oddMax));
        }
        System.out.printf("EvenSum = %s ,",df.format(evenSum));
        if(eveneMin == 1000000000.0){
            System.out.printf("EvenMin = No ");
        }else {
            System.out.printf("EvenMin = %s%n",df.format(eveneMin));
        }
        if(evenMax == -1000000000.0){
            System.out.printf("EvenMax = No ");
        }else {
            System.out.printf("EvenMax = %s%n",df.format(evenMax));
        }

    }
}
