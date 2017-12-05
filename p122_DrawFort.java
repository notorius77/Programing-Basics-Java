package Programing.basics;

import java.util.Scanner;

public class p122_DrawFort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int houses = n / 2;
        int slashes = 2*n-2*(n/2)-4;
            System.out.printf("/%s\\%s/%s\\\n", repeatString("^", houses),
                    repeatString("_", slashes),
                    repeatString("^", houses));

        int midSpaces = (2 * n)- 2;
        for (int i = 0; i < n - 3 ; i++) {
            System.out.printf("|%s|\n", repeatString(" ",midSpaces));
        }

        int rowSpaces = (n /2 )+ 1;
        int rowSlashes = 2*n-2*(n/2)-4;
        System.out.printf("|%s%s%s|\n", repeatString( " ",rowSpaces),
                repeatString("_",rowSlashes),
                repeatString(" ",rowSpaces));



        int downSlash = n /2;
        int downSpaces =  2*n-2*(n/2)-4;
        System.out.printf("\\%s/%s\\%s/", repeatString("_",downSlash),
                repeatString(" ",downSpaces),
                repeatString("_",downSlash));
    }

    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
