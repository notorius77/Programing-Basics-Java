package Programing.basics;

import java.util.Scanner;

public class p22_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (num <= 100) {
            bonus = bonus + 5;
        } else if (num > 100 && num <= 1000) {
            bonus = bonus + num * 0.2;
        } else if (num > 1000) {
            bonus = bonus + num * 0.1;
        }
        if (num % 2 == 0) {
            bonus = bonus + 1;
        } else if (num % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + num);
// znakut && e logi4esko i
    }
}
