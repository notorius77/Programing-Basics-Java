package Programing.basics;

import java.util.Scanner;

public class p15_VegetableStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VegPricePerKiloLV = Double.parseDouble(scanner.nextLine());
        double FrootPricePerKiloLv = Double.parseDouble(scanner.nextLine());
        double TotalVegKilo = Integer.parseInt(scanner.nextLine());
        double TotalFrootKilo = Integer.parseInt(scanner.nextLine());

        double TotalVegIncome = VegPricePerKiloLV * TotalVegKilo;
        double TotalFrootIncome = FrootPricePerKiloLv * TotalFrootKilo;
        double Income = TotalVegIncome + TotalFrootIncome;
        double TotalIncomeInEUR = Income / 1.94;

        System.out.printf("TotalIncomeInEUR =  %.14f" ,TotalIncomeInEUR);

    }
}
