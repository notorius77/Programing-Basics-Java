package Programing.basics;

import java.util.Scanner;

public class p92_Snejinka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftRightPoint = 0;
        int midPoint = n;
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%s*%s*%s*%s\n", repeatString(".", leftRightPoint),
                    repeatString(".",midPoint),
                    repeatString(".",midPoint),
                    repeatString(".", leftRightPoint));
            leftRightPoint++;
            midPoint--;
        }
        System.out.printf("%s%s%s\n", repeatString("." , (((n * 2)+ 3) - 5)/ 2),
                repeatString("*", 5),
                repeatString("." , (((n * 2)+ 3) - 5)/ 2));

        System.out.printf("%s\n",repeatString("*", (n * 2 )+ 3));

        System.out.printf("%s*****%s\n", repeatString("." , (((n * 2)+ 3) - 5)/ 2),
                repeatString("." , (((n * 2)+ 3) - 5)/ 2));

         int botLRPoint = (((n * 2) + 3) - 7) / 2;
         int botMIDPoint = 2;

        for (int i = 0; i < n - 1 ; i++) {
          System.out.printf("%s*%s*%s*%s\n", repeatString(".", botLRPoint),
                  repeatString(".",botMIDPoint),
                  repeatString(".",botMIDPoint),
                  repeatString(".", botLRPoint));
          botLRPoint--;
          botMIDPoint++;
        }

    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <=count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
