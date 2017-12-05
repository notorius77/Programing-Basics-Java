package Programing.basics;

import java.util.Scanner;

public class p76_EqualPairs
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int pairSum = 0;
        int maxDiff = 0;
        int lastSum = 0;

        for (int i = 0; i < n; i++)
        {
            int a = Integer.parseInt(console.nextLine());
            int b = Integer.parseInt(console.nextLine());

            pairSum = a + b;

            if (i > 0) {
                int diff = Math.abs(pairSum - lastSum);

                if (diff > maxDiff) maxDiff = diff;
            }
            lastSum = pairSum;
        }

        System.out.println((maxDiff == 0) ?
                "Yes, value=" + pairSum : "No, maxdiff=" + maxDiff);
    }
}