package Programing.basics;

import java.util.Scanner;

public class p48_TreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double brother1 = Double.parseDouble(scanner.nextLine());
        double brother2 = Double.parseDouble(scanner.nextLine());
        double brother3 = Double.parseDouble(scanner.nextLine());
        double fatherFishing = Double.parseDouble(scanner.nextLine());

        double totalCleaningTime = 1 / (1/brother1 + 1/brother2 + 1/brother3);
        double totalCleaningTimeRest = totalCleaningTime + (totalCleaningTime * 0.15);
        double timeleft = fatherFishing - totalCleaningTimeRest;

        if (timeleft >= 0) {
            System.out.printf("Cleaning time: %.2f %n",totalCleaningTimeRest);
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.",Math.floor(timeleft));
        }else {
            timeleft=  totalCleaningTimeRest - fatherFishing;
            System.out.printf("Cleaning time: %.2f %n",totalCleaningTimeRest);
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",Math.ceil(timeleft));
        }
    }
}
