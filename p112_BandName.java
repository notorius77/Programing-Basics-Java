package Programing.basics;

import java.util.Scanner;

public class p112_BandName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        char d = scanner.nextLine().charAt(0);
        int n  = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (char i = 'A'; i <= a; i++) {
            for (char j = 'a'; j <= b ; j++) {
                for (char k = 'a'; k <= c  ; k++) {
                    for (char l = 'a'; l <= d ; l++) {
                        for (int m = 0; m <= n; m++) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count - 1);
    }
}
