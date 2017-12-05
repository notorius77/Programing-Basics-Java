package Programing.basics;

import java.util.Scanner;

public class p118_Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int star = 1;
        int minus = (n * 2) - 1;
        for (int i = 0; i <= n - 1; i++) {
            System.out.printf("%s\\%s/%s\n", repeatString("*", star),
                    repeatString("-", minus),
                    repeatString("*", star));
            star++;
            minus -= 2;
        }
////dynamic mid partt
        int statickStar = (n / 2);
        int midstar = n;
        for (int i = 0; i <(((n / 2) / 2) +1) ; i++) {
            System.out.printf("|%s\\%s/%s|\n", repeatString("*", statickStar),
                    repeatString("*", midstar),
                    repeatString("*", statickStar));
            statickStar++;
            midstar -=2;
        }

        int botMinus = 1;
        int botStars = (n * 2) - 1;
        for (int i = 0; i < n ; i++) {
            System.out.printf("%s\\%s/%s\n", repeatString("-",botMinus),
                    repeatString("*",botStars),
                    repeatString("-",botMinus));
            botMinus++;
            botStars-=2;
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