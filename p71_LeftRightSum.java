package Programing.basics;

import java.util.Scanner;

public class p71_LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        int readcount = 2 * n;
        for (int i = 0; i < readcount; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (i < n) {
                left += num;
            }else {
                right += num;
            }
            if ( left != right){
                System.out.printf("No, diff = %d",Math.abs(left - right));
            }else {
                System.out.printf("Yes, sum = ",left);
            }
        }
    }
}