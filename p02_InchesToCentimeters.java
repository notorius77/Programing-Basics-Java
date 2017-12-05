package Programing.basics;

import java.util.Scanner;

public class p02_InchesToCentimeters {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);

        System.out.print("inches:");
        double inches = Double.parseDouble(console.nextLine());
        double cantimeters = inches * 2.54;
        System.out.println("centimeters = " + cantimeters);

    }
}
