package Programing.basics;

import java.util.Scanner;

public class p29_Time15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hh = Integer.parseInt(scanner.nextLine());
        int mm = Integer.parseInt(scanner.nextLine());
        mm = mm + 15;
        if (mm > 59){
            mm = mm - 60;
            hh = hh + 1;
        }
        if (hh > 23){
            hh = 0;
        }
        if (mm < 10) {
            System.out.printf("%d:0%d", hh, mm);
        }else{
            System.out.printf("%d:%d", hh, mm);
        }

    }
}