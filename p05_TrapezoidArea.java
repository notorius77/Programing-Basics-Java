package Programing.basics;

import java.util.Scanner;

public class p05_TrapezoidArea {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        Double b1 = Double.parseDouble(console.nextLine());
        Double b2 = Double.parseDouble(console.nextLine());
        Double h = Double.parseDouble(console.nextLine());
        Double area = (b1 + b2) * h / 2 ;

        System.out.println("Trapezoid area = " + area);

    }
}
