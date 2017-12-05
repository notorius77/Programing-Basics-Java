package Programing.basics;

import java.util.Scanner;

public class p149_izpit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg = Double.parseDouble(scanner.nextLine());
        String delivery = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());

        double cena= 0;
        double nadcenka =0;
        if("Standard".equalsIgnoreCase(delivery)){
             if ( kg <=1.000){
               cena = 0.03;
             }else if (kg > 1.000 && kg < 10){
              cena = 0.05;
             }else if (kg > 11 && kg <= 40){
              cena = 0.10;
             }else if ( kg > 41 && kg <=90){
                 cena= 0.15;
             }else if ( kg > 91 && kg <= 150){
                cena = 0.20;
             }
             double totalprice = distance * cena;
             double allprice = totalprice / 1000;
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kg,totalprice);
        }else if ("Express".equalsIgnoreCase(delivery)){
            if ( kg <=1.000){
                cena = 0.03;
                nadcenka = ((0.03 * 80)/100);
            }else if (kg > 1.000 && kg <= 10){
                cena = 0.05;
                nadcenka = ((0.05 *40)/100);
            }else if (kg > 11 && kg <= 40){
                cena = 0.10;
                nadcenka = ((0.10 *5)/100);
            }else if ( kg > 41 && kg <=90){
                cena= 0.15;
                nadcenka =((0.15 *2)/100);
            }else if ( kg > 91 && kg <= 150){
                cena = 0.20;
                nadcenka = ((0.20 * 1)/100);
            }
             double totalprice = distance * cena;
            double totalNadcenka = kg * nadcenka;
            double totalDistance = distance * totalNadcenka;
            double all = totalprice + totalDistance;
            System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kg,all);
        }


    }
}
