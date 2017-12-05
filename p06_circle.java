package Programing.basics;

import java.util.Scanner;

public class p06_circle {
    public static void main (String [] args){
         Scanner console = new Scanner(System.in);
         System.out.print("Enter circle radius. r= ");
         double r = Double.parseDouble(console.nextLine());
         System.out.println("Area = " + Math.PI * r * r);
         System.out.println("Perimeter = "+ 2 * Math.PI * r);

    }
}
