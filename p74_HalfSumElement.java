package Programing.basics;

import java.util.Scanner;

public class p74_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > max)
                max = num;
                sum += num;
        }
                sum -= max;
        int diff = Math.abs(sum - max);

        System.out.println((diff == 0) ? "Yes Sum = " + max : "No Diff = " + diff);
    }
}