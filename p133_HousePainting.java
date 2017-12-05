package Programing.basics;

import java.util.Scanner;

public class p133_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double twoSideWalls = (sideWall * 2) - (window * 2);
        double backWall = x * x;
        double entrance = 1.2 * 2;
        double twoBackWalls = (backWall * 2) - entrance;

        double totalHouse = twoSideWalls + twoBackWalls;
        double greenPaint = totalHouse / 3.4;

        double roof = 2 * ( x * y);
        double roofFront = (2 * ((x * h)/ 2));
        double totalRoof = roof + roofFront;
        double redPaint = totalRoof / 4.3;

        System.out.printf("%.2f\n",greenPaint);
        System.out.printf("%.2f",redPaint);

    }
}
