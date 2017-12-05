package Programing.basics;

import java.util.Scanner;

public class p86_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
//        int rowscount = 2 * n - 1;
//        int colCount = 2 * n - 1;
        int upDownRowls = n - 1;

        for (int i = 0; i <= upDownRowls ; i++) {
            System.out.print(povtarq6tSeNiz(" ",upDownRowls - i) + "*");
            System.out.println(povtarq6tSeNiz( " *",i));
        }
        for (int i = upDownRowls- 1; i >= 0 ; i--) {
            System.out.print(povtarq6tSeNiz(" ",upDownRowls - i) + "*");
            System.out.println(povtarq6tSeNiz( " *",i));
        }
    }



    static String povtarq6tSeNiz(String text, int broiPovtoreniq) {
        StringBuilder result = new StringBuilder();//String result = "";
        for (int i = 0; i < broiPovtoreniq; i++) {  //
            result.append(text);//result = result + text;
        }
        return result.toString();//return result;
    }
}
