package Programing.basics;

import java.util.Scanner;

public class p94_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s\n",repeatString("#" , n * 4 + 1));
        int dot = 1 ;
        int hashTag = (n * 2) - 1;
        int space = 1 ;

        int dotsMid = (n / 2) + 1;
//        int hashtagMid = dotsMid + 2;
        int spaceMID = dotsMid - 2;

        int allsize = (n * 4) + 1;
        int diffRow = ((dotsMid + dotsMid) + (spaceMID + spaceMID)) + 3 ;
        int hashtagMid = (allsize - diffRow) / 2;
        for (int i = 0; i <(n * 2 )/ 2; i++) {
            if ( i == (n / 2)) {
                System.out.printf("%s%s%s(@)%s%s%s\n", repeatString(".", dotsMid),
                        repeatString("#",hashtagMid),
                        repeatString(" ",spaceMID),
                        repeatString(" ",spaceMID),
                        repeatString("#",hashtagMid),
                        repeatString(".", dotsMid));
                dot++;
                hashTag-=2;
                space+=2;
             continue;
            }

            System.out.printf("%s%s%s%s%s\n", repeatString(".", dot),
                    repeatString("#", hashTag),
                    repeatString(" ", space),
                    repeatString("#", hashTag),
                    repeatString(".", dot));
            dot++;
            hashTag-=2;
            space+=2;



        }

        int pointsBOT = n + 1 ;
        int hashesBOT = n * 2 - 1;
        for (int i = 0 ; i < n ; i++) {
          System.out.printf("%s%s%s\n", repeatString(".",pointsBOT),
                  repeatString("#",hashesBOT),
                  repeatString(".",pointsBOT));

                  pointsBOT+=1;
                  hashesBOT-=2;
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