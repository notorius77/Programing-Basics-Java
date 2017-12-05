package Programing.basics;

import java.util.Scanner;

public class p132_Rocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int dot = ((3 * n) / 2) - 1;
            System.out.printf("%s/\\%s\n", repeatString(".", dot),
                    repeatString(".", dot));
        int spaces = 2;
        int topDots = ((3 * n) / 2) - 2;
        for (int i = 0; i < n - 1 ; i++) {
            System.out.printf("%s/%s\\%s\n",repeatString(".",topDots),
                    repeatString(" ",spaces),
                    repeatString(".",topDots));
            topDots--;
            spaces+=2;
        }

        int staticDot = n / 2;
        int star = n * 2;
        System.out.printf("%s%s%s\n",repeatString(".",staticDot),
                repeatString("*",star),
                repeatString(".",staticDot));

        int slashes = (n * 2) - 2;
        for (int i = 0; i < n * 2 ; i++) {
            System.out.printf("%s|%s|%s\n", repeatString(".", staticDot),
                    repeatString("\\", slashes),
                    repeatString(".", staticDot));
        }
            int botDots = n / 2;
            int botStars =( n * 2 )- 2;
            for (int j = 0; j < n / 2 ; j++) {
                System.out.printf("%s/%s\\%s\n", repeatString(".",botDots),
                        repeatString("*",botStars),
                        repeatString(".",botDots));
                botDots--;
                botStars+=2;
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