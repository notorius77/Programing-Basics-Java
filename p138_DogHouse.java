package Programing.basics;

import java.util.Scanner;

public class p138_DogHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a =Double.parseDouble(scanner.nextLine());
        double b =Double.parseDouble(scanner.nextLine());

        double twoWalls = a * ((a / 2) * 2);

        //backwalls
        double square = (a / 2) * (a / 2);
        double triangle = ((a/ 2) * (b - (a /2)) / 2);
        double backWalls = square + triangle;

        double entrance = (a / 5) * (a / 5);
        double frontWall = backWalls - entrance;

        double totalHouse = twoWalls + backWalls + frontWall;

        double greenPaint = totalHouse / 3;
        double roof =(a * (a/2))* 2;
        double redPaint = roof / 5;

        System.out.printf("%.2f\n%.2f",greenPaint,redPaint);
    }
}
