package Programing.basics;

import java.util.Scanner;

public class p91_Shevica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%sx%s\n",repeatStr(".", ((n * 3) - 1) / 2),
                 repeatStr(".", ((n * 3) - 1) / 2) ) ;

        System.out.printf("%s/x\\%s\n",repeatStr(".", ((n * 3) - 3) / 2),
                repeatStr(".", ((n * 3) - 3) / 2) ) ;
        System.out.printf("%sx|x%s\n",repeatStr(".", ((n * 3) - 3) / 2),
                repeatStr(".", ((n * 3) - 3) / 2) ) ;

        dynamicPart(n);

        System.out.printf("%s/x\\%s\n",repeatStr(".", ((n * 3) - 3) / 2),
                repeatStr(".", ((n * 3) - 3) / 2) ) ;

        System.out.printf("%s\\x/%s\n",repeatStr(".", ((n * 3) - 3) / 2),
                repeatStr(".", ((n * 3) - 3) / 2) ) ;

        dynamicPart(n);

        System.out.printf("%sx|x%s\n",repeatStr(".", ((n * 3) - 3) / 2),
                repeatStr(".", ((n * 3) - 3) / 2) ) ;
        System.out.printf("%s\\x/%s\n",repeatStr(".", ((n * 3) - 3) / 2),
                repeatStr(".", ((n * 3) - 3) / 2) ) ;
        System.out.printf("%sx%s\n",repeatStr(".", ((n * 3) - 1) / 2),
                repeatStr(".", ((n * 3) - 1) / 2) ) ;


    }

    private static void dynamicPart(int n) {
        int point = ((n * 3) - ((n * 2) + 1 )) / 2;
        int X = n;

        for (int i = 0; i < (n + 1 )/ 2 ; i++) {
            System.out.printf("%s%s|%s%s\n", repeatStr( ".",point),
                    repeatStr("x" , X),
                    repeatStr("x" , X),
                    repeatStr( ".",point));
            point--;
            X++;
        }
        int midpoint = 1;
        int midX = (((n * 3) - 1) / 2) - 1;
        for (int i = 0; i < n / 2 ; i++) {
            System.out.printf("%s%s|%s%s\n" , repeatStr( ".",midpoint),
                    repeatStr("x",midX),
                    repeatStr("x",midX),
                    repeatStr(".", midpoint));
            midpoint++;
            midX--;
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