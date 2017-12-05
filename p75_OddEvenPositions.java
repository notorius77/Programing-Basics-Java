package Programing.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p75_OddEvenPositions
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int n = Integer.parseInt(console.nextLine());

        double max = 1000000000.0;
        double min = -1000000000.0;

        // For odd positions of 'n'
        double oddSum = 0d;
        double oddMin = max;
        double oddMax = min;

        // For even positions of 'n'
        double evenSum = 0d;
        double evenMin = max;
        double evenMax = min;

        for (int i = 1; i <= n; i++)
        {
            double num = Double.parseDouble(console.nextLine());

            if (i % 2 != 0) {
                if (num < oddMin) oddMin = num;
                if (num > oddMax) oddMax = num;
                oddSum += num;
            }
            else {
                if (num < evenMin) evenMin = num;
                if (num > evenMax) evenMax = num;
                evenSum += num;
            }
        }
        System.out.printf("OddSum=%s,%nOddMin=%s,%nOddMax=%s,%n",
                df.format(oddSum),
                ((oddMin == max) ? "No" : df.format(oddMin)),
                ((oddMax == min) ? "No" : df.format(oddMax)));

        System.out.printf("EvenSum=%s,%nEvenMin=%s,%nEvenMax=%s%n",
                df.format(evenSum),
                ((evenMin == max) ? "No" : df.format(evenMin)),
                ((evenMax == min) ? "No" : df.format(evenMax)));
    }
}