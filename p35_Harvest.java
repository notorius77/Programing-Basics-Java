package Programing.basics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p35_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double z = Double.parseDouble(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = x * y;
        double wine = 40 * totalGrape / 2.5 / 100;

        if ( wine >= 40 ) {
            DecimalFormat decimalFormat = new DecimalFormat("0");
            System.out.println("Good Harvest this year! Total wine:" + decimalFormat.format(Math.floor(wine) + "liters"));
            double litersleft = wine - z;
            double litersWorkers = litersleft/ workers ;
            System.out.printf(" %.0f liters left -> %.0f liters per worker.", Math.ceil(litersleft), Math.ceil(litersWorkers));
        }else if (wine < 40){
            double more = z - wine;
            System.out.printf(" It will be tough winter! More %.0f liters wine needed" ,Math.ceil(more));
        }
    }
}
