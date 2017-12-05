package Programing.basics;

import java.util.Scanner;

public class p87_CristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int spaces = n;
        for (int i = 0; i <= n; i++) {
            System.out.println(repeatStr(" ", spaces)
                    + repeatStr("*", i)
                    + " | "
                    + repeatStr("*", i));
            spaces--;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}