package Programing.basics;

import java.util.Scanner;

public class p88_Sunglasess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String stars = repeatStr("*",n * 2 );
        String space = repeatStr(" ",n);
        System.out.println(stars + space + stars);
        for (int i = 0; i < n - 2 ; i++) {
            String slash = repeatStr("/", n * 2 - 2);
            String pipes = repeatStr("|", n);
//            if (n % 2 == 0) {
//                if (i == (n - 1) / 2 - 1) {
//                    System.out.print("*" + slash + "*");
//                    System.out.print(pipes);
//                    System.out.println("*" + slash + "*");
//                } else {
//                    System.out.print("*" + slash + "*");
//                    System.out.print(space);
//                    System.out.println("*" + slash + "*");
//                }
//            } else {
//                if (i == (n - 2 )/ 2 ) {
//                    System.out.print("*" + slash + "*");
//                    System.out.print(pipes);
//                    System.out.println("*" + slash + "*");
//                } else {
//                    System.out.print("*" + slash + "*");
//                    System.out.print(space);
//                    System.out.println("*" + slash + "*");
//                }
//            }
            //METOD S TERNAREN OPERATOR
                    System.out.print("*" + slash + "*");
                    System.out.print(i == (n - 1) / 2 - 1 ? pipes:space);
                    System.out.println("*" + slash + "*");
        }
        System.out.println(stars + space + stars);
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += strToRepeat;
        }
        return text;
    }
}