package Programing.basics;

import java.util.Scanner;

public class p11_USDtoBGN {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        double USD = Double.parseDouble(console.nextLine());
        double BGN = USD * 1.79549;
        System.out.printf("USD = %.2f" , BGN);
    }
}
