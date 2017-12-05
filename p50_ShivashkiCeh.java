package Programing.basics;

import java.util.Scanner;

public class p50_ShivashkiCeh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tables = Double.parseDouble(scanner.nextLine());
        double lenght = Double.parseDouble(scanner.nextLine());
        double weist = Double.parseDouble(scanner.nextLine());

        double totalSheets = tables * ( lenght + 2 * 0.30) * (weist + 2 * 0.30);
        double totalKareta = tables * ( lenght / 2) * (lenght / 2);

        double priceUSD = totalSheets * 7 + totalKareta * 9;
        double priceBGN = priceUSD * 1.85;

        System.out.printf(" %.2f USD %n",priceUSD);
        System.out.printf(" %.2f BGN",priceBGN);
    }
}
