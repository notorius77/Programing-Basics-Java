package Programing.basics;

import java.util.Scanner;

public class p14_Classroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        int rolls = (int)(h * 100 / 120);
        int desks = (int)((w * 100 - 100) / 70);

        int result = rolls * desks - 3;

        System.out.println(result);

    }
}
