package Programing.basics;

import java.util.Scanner;

public class p121_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n = Double.parseDouble(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        double parcent1 = 0;
        double parcent2 = 0;
        double parcent3 = 0;
        double parcent4 = 0;
        double parcent5 = 0;

        for (int i = 1; i <= n ; i++) {
            Double m = Double.parseDouble(scanner.nextLine());
            if (m < 200) {
               p1++;
            }else if ( m >= 200 && m <= 399) {
                p2++;
            }else if ( m >=400 && m <= 599) {
                p3++;
            }else if (m >=600 && m <= 799) {
               p4++;
            }else if ( m >= 800) {
               p5++;
            }
        }
        parcent1 = p1 / n * 100;
        parcent2 = p2 / n * 100;
        parcent3 = p3 / n * 100;
        parcent4 = p4 / n * 100;
        parcent5 = p5 / n * 100;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n",parcent1,parcent2,parcent3,parcent4,parcent5);
    }
}
