package Programing.basics;

import java.util.Scanner;

public class p117_SoftULICamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double carParsent = 0;
        double microBus = 0;
        double smallBus = 0;
        double bigBus = 0;
        double train = 0;

        double car = 0;
        double mb = 0;
        double sb = 0;
        double bb = 0;
        double t = 0;

         int allPPl = 0;
        for (int i = 1; i <= n ; i++) {
            int numPPl = Integer.parseInt(scanner.nextLine());
            allPPl = allPPl + numPPl;
            if (numPPl <= 5) {
                carParsent += numPPl;
            }else if (numPPl >=6 && numPPl <= 12){
                microBus += numPPl;
            }else if (numPPl >= 13 && numPPl <= 25) {
                smallBus += numPPl;
            }else if (numPPl >=26 && numPPl <= 40){
               bigBus += numPPl;
            }else if (numPPl >= 41) {
                train += numPPl;
            }
        }
        car = (carParsent / allPPl) * 100;
        mb = (microBus / allPPl) * 100;
        sb = (smallBus / allPPl) * 100;
        bb = (bigBus / allPPl) * 100;
        t = (train / allPPl) * 100;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%",car,mb,sb,bb,t);
    }
}
