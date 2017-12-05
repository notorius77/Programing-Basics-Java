package Programing.basics;

import java.util.Scanner;

public class p131_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double totalTons = 0;
        double midPrice = 0;
        double microbus = 0;
        double truck = 0;
        double train = 0;
        for (int i = 0; i < n ; i++) {
           double kG = Double.parseDouble(scanner.nextLine());
            totalTons += kG;
            if (kG >= 0 && kG <=3){
                microbus += kG;
            }else if (kG >= 4 && kG <=11){
               truck += kG;
            }else {
                train += kG;
            }
            midPrice = ((200 * microbus) + (175 * truck) + (120 * train)) / totalTons;
        }

        double paracentMicro = microbus / totalTons * 100;
        double parcentTruck = truck / totalTons * 100;
        double parcentTrain = train / totalTons * 100;

        System.out.printf("%.2f\n%.2f%%\n%.2f%%\n%.2f%%",midPrice,paracentMicro,parcentTruck,parcentTrain);
    }
}
