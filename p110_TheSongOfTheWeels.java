package Programing.basics;

import java.util.Scanner;

public class p110_TheSongOfTheWeels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = Integer.parseInt(scanner.nextLine());
        if (M < 4 || M > 144) {
            System.out.println("No!");
            return;
        }
        int controlSum = 0;
        String pass = "";
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        int sum = ((a * b) + (c * d));
                        if (((a < b) && (c > d)) && sum == M) {
                            controlSum++;
                            if (controlSum == 4) {
                                pass = "" + a + b + c + d;
                            }
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }

                    }
                }
            }
        }
        if (controlSum < 4) {
            System.out.println();
            System.out.println("No!");
        } else {
            System.out.println();
            System.out.printf("Password: %s\n", pass);
        }
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}