package Programing.basics;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class p95_Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int width = 2 * n - 1;
        int height = n / 2 + 4;

        System.out.printf("@%1$s@%1$s@%n", repeatString(" ", (width - 3) / 2));
        int k = 0;
        int count = n - 3;
        for (int i = 0, b = 0, c = -1; i < height - 4; i++, b++, c += 2) {

            System.out.printf("*%1$s%2$s%5$s%4$s%2$s%5$s%1$s%n",
                    repeatString(".", b) + "*",
                    repeatString(" ", count),
                    repeatString(".", b),
                    (i != 0 && i <= n / 2 - 1) ? repeatString(".", c) + "*" : repeatString(".", c),
                    i != n/2 -1 ? "*":"");
            k = 2;
            count -= k;
        }


        for (int i = 0; i < 3; i++) {
            String line = i == 0 ? String.format("*%1$s%2$s*.*%2$s%1$s*",
                    repeatString(".",n/2),
                    repeatString("*",(width - (n +5)) / 2)) :
                    repeatString("*",width);
            System.out.println(line);
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
