package Programing.basics;

import java.util.Scanner;

public class p137_Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String firstLine = repeatStr("*", 2*n + 1);
        System.out.println(firstLine);

        for (int i = 1; i <=n-1 ; i++) {
            if (i/1 == 1){
                String firstLoop = repeatStr(".", i)
                        + "*"
                        + repeatStr(" ", 2*n - 2*i -1)
                        + "*"
                        + repeatStr(".", i);
                System.out.println(firstLoop);
            } else {
                String firstLoop = repeatStr(".", i)
                        + "*"
                        + repeatStr("@", 2*n - 2*i -1)
                        + "*"
                        + repeatStr(".", i);
                System.out.println(firstLoop);
            }
        }

        String middleLine = repeatStr(".", n)
                + "*"
                + repeatStr(".", n);
        System.out.println(middleLine);

        for (int i = 1; i<=n-1 ; i++) {
            if (i/(n-1) == 1){
                String lastLoop = repeatStr(".", n - i)
                        + "*"
                        + repeatStr("@",2*n -3 )
                        + "*"
                        + repeatStr(".", n - i);
                System.out.println(lastLoop);
            }
            else {
                String lastLoop = repeatStr(".", n - i)
                        + "*"
                        + repeatStr(" ", i-1)
                        + "@"
                        + repeatStr(" ", i-1)
                        + "*"
                        + repeatStr(".", n - i);
                System.out.println(lastLoop);
            }

        }
        System.out.println(firstLine);


    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}
