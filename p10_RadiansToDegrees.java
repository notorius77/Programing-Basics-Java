package Programing.basics;

import java.util.Scanner;

public class p10_RadiansToDegrees {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        double rad = Double.parseDouble(console.nextLine());
        double deg = rad * 180 / Math.PI;
        System.out.printf("Degrees = %.0f" , deg);
    }
}
