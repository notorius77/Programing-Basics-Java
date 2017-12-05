package Programing.basics;

import java.util.Scanner;

public class p142_SoftUniLogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

            int dot = ((12 * n )- 6)/ 2;
        System.out.printf("%s#%s\n",repeatString(".",dot),
                repeatString(".",dot));

        int topDots = (((12 * n) - 11)/2);
        int topHashtag = 7;
        for (int i = 0; i < (n * 2) - 1 ; i++) {
            System.out.printf("%s%s%s\n",repeatString(".",topDots),
                    repeatString("#",topHashtag ),
                    repeatString(".",topDots));
            topDots-=3;
            topHashtag+=6;
        }

        int dotss = 2;
        int dot2 = 3;
        int midHashtag = ((12 * n) - 5) -6;
        for (int i = 0; i <( n * 2) - 3 ; i++) {
            System.out.printf("|%s%s%s\n",repeatString(".",dotss),
                    repeatString("#",midHashtag),
                    repeatString(".",dot2));
            dotss+=3;
            dot2+=3;
            midHashtag-=6;
        }

        int botDot = (((n * 6 )+ 1)+((n * 2) + 1)) - (( n * 12) - 5);
        int botHashtags = (n * 6 )+ 1;
        int botDot2 =  (n * 2) + 1;
        System.out.printf("@%s%s%s", repeatString(".",botDot),
                repeatString("#",botHashtags),
                repeatString(".",botDot2));

    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
    }
}
