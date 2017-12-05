package Programing.basics;

import java.util.Scanner;

public class p90_Diamond {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            if(n == 1){
                System.out.println("*");
                return;
            }

            if (n % 2 == 0) {

                int leftRight = n / 2 - 1;

                for (int i = 0; i < n / 2; i++) {

                    System.out.print(repeatStr("-", leftRight) + "*");
                    System.out.print(repeatStr("-", n - 2 * leftRight - 2) + "*"); //
                    System.out.println(repeatStr("-", leftRight));
                    leftRight--;
                }
                leftRight = 1;
                int dashes = n - 4;

                for (int i = 0; i < n / 2 - 1; i++) {

                    System.out.print(repeatStr("-", leftRight) + "*");
                    System.out.print(repeatStr("-", dashes));
                    System.out.println( "*" + repeatStr("-", leftRight));

                    leftRight++;
                    dashes -=2;
                }

            } else {

                String firstLastRow = repeatStr("-", n /2)
                        + "*"
                        + repeatStr("-", n/2);

                System.out.println(firstLastRow);

                int leftRight = n / 2 - 1;
                int dashes = 1;

                for (int i = 0; i < n /2; i++) {
                    System.out.print(repeatStr("-", leftRight) + "*");
                    System.out.print(repeatStr("-", dashes));
                    System.out.println( "*" + repeatStr("-", leftRight));

                    leftRight--;
                    dashes += 2;
                }

                leftRight = 1;
                dashes -= 2;
                for (int i = 0; i < n / 2 - 1; i++) {

                    System.out.print(repeatStr("-", leftRight) + "*");
                    System.out.print(repeatStr("-", dashes - 2));
                    System.out.println("*" + repeatStr("-", leftRight));

                    dashes -=2;
                    leftRight++;
                }
                System.out.println(firstLastRow);
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
