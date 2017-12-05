package Programing.basics;

import java.util.Scanner;

public class p89_House {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            int dashesEven = (n-2)/2;
            int dashesOdd = (n-1)/2;
            int starsEven = 1;
            int starsOdd = 1;

            int roof = (n+1)/2;
            for (int rowRoof = 1; rowRoof <= roof; rowRoof++) {
                if (n%2==0) {
                    System.out.println(repeatString("-", dashesEven) +
                            repeatString("**", starsEven) +
                            repeatString("-", dashesEven));
                    dashesEven--;
                    starsEven++;
                } else {
                    System.out.println(repeatString("-", dashesOdd) +
                            repeatString("*", starsOdd) +
                            repeatString("-", dashesOdd));
                    starsOdd+=2;
                    dashesOdd--;
                }
            }

            int base = n/2;
            for (int rowBase = 1; rowBase <= base; rowBase++) {
                System.out.println("|" + repeatString("*", n-2) + "|");
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
