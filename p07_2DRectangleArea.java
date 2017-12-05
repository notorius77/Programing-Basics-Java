package Programing.basics;

import java.util.Scanner;

public class p07_2DRectangleArea {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);
        Double x1 = Double.parseDouble(console.nextLine());
        Double y1 = Double.parseDouble(console.nextLine());
        Double x2 = Double.parseDouble(console.nextLine());
        Double y2 = Double.parseDouble(console.nextLine());
        Double a = Math.abs(y1 - y2);
        Double b = Math.abs(x1 - x2);
        Double area = a * b;
        Double perimeter = 2 * (a + b);
        System.out.println("Rectangle area = " + area);
        System.out.println("Rectangle perimeter = " + perimeter);

    }
}