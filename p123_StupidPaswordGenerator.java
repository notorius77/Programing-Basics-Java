package Programing.basics;

import java.util.Scanner;

public class p123_StupidPaswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int letters = Integer.parseInt(scanner.nextLine());

        int biger = 1;

        int c = 97;
        int d = 97;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < num; j++) {
            for (int m = 0; m <= letters ; j++) {
                for (int k = 0; k <= letters; k++) {
                  if ( i  > j) {
                  biger = i + 1;
                  }else {
                      biger = j + 1;
                  }
                    for (int l = biger; l <=num ; l++) {
                        System.out.printf("%s%s", i ,j);
                    }
                }
            }

            }

        }
    }
}
