package Programing.basics;

import java.util.Scanner;

public class p129_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months=Integer.parseInt(scanner.nextLine());
        double electricitySum=0;
        int water =20;
        int net = 15;
        double others =0;

        double totalSum= 0;

        for (int i = 0; i < months; i++) {
            double electricity=Double.parseDouble(scanner.nextLine());
            electricitySum+=electricity;
            double sum= 1.2*(electricity+net+water);
            others+=sum;
        }

        totalSum=electricitySum+others+(water+net)*months;

        double average=totalSum/months;
        double totalWater=water*months;

        System.out.printf("Electricity: %.2f lv\n",electricitySum);
        System.out.printf("Water: %.2f lv\n",totalWater);
        System.out.printf("Internet: %.2f lv\n",1.0*net*months);
        System.out.printf("Other: %.2f lv\n",others);
        System.out.printf("Average: %.2f lv\n",average);

    }
}