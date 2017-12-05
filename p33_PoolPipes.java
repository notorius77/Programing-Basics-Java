package Programing.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p33_PoolPipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int v = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double totalFilledWater = h * P1 + h * P2;
        double totalFill = Math.floor(totalFilledWater / v * 100);
        double totalP1 = Math.floor( P1 * h / totalFilledWater * 100);
        double totalP2 = Math.floor( P2 * h / totalFilledWater * 100);
        if(totalFilledWater > v){
            System.out.printf("For %f hours the pool overflows with %f liters.",df.format(h),totalFilledWater - v);
        }else {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0%%. Pipe 2: %.0f$$.",totalFill,totalP1, totalP2);
        }
    }
}
