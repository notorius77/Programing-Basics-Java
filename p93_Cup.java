package Programing.basics;

import java.util.Scanner;

public class p93_Cup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int hashtag = (((n * 5) - (n * 2))) ;
        int point = n;
        for (int i = 0; i < n / 2 ; i++) {
            System.out.printf("%s%s%s\n", repeatString(".", point),
                    repeatString("#",hashtag),
                    repeatString(".",point));
            point++;
            hashtag-=2;
        }

        int midDots= (n / 2)+ n ;
        int midPoint = ( n * 2) - 2;
        for (int i = 0; i < (n  / 2) + 1  ; i++) {
            System.out.printf("%s#%s#%s\n" , repeatString(".", midDots),
                    repeatString(".",midPoint),
                    repeatString(".",midDots));
            midDots++;
            midPoint-=2;
        }
        int midHashtag = n;
        int midPoints =  ((n *  5) - n) / 2;
        System.out.printf("%s%s%s\n",repeatString(".",midPoints),
                repeatString("#",midHashtag),
                repeatString(".",midPoints));



        int maxLenght = n * 5;
        int promenliva = (n * 2 ) - 2;

        for (int i = 0; i < n / 2 ; i++) {
            System.out.printf("%s%s%s\n", repeatString(".",promenliva),
                    repeatString("#", maxLenght - (promenliva + promenliva)),
                    repeatString(".", promenliva));
        }

          int dots = ((n * 5) -10) / 2;
        String dance = "D^A^N^C^E^";
        System.out.printf("%s%s%s\n", repeatString(".", dots),
                repeatString(dance, 1),
                repeatString(".", dots));


        for (int i = 0; i < (n / 2) + 1 ; i++) {
            System.out.printf("%s%s%s\n", repeatString(".",promenliva),
                    repeatString("#", n + 4),
                    repeatString(".",promenliva));
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
