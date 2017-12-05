package Programing.basics;

import java.util.Scanner;

    public class p144_Flowers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hrizantemiCount = Integer.parseInt(scanner.nextLine());
            int roziCount = Integer.parseInt(scanner.nextLine());
            int laletaCount = Integer.parseInt(scanner.nextLine());
            String season = scanner.nextLine();
            String hollydayYN =scanner.nextLine();

            double price = 0;
            double priceHrizantemi = 0;
            double priceRozi = 0;
            double priceLaleta = 0;
            double aranjirane = 2;
            if ("Spring".equalsIgnoreCase(season) || "Summer".equalsIgnoreCase(season)){
                if("Y".equalsIgnoreCase(hollydayYN)){
                    priceHrizantemi = 2.00 + ((2.00 * 15)/ 100);
                    priceRozi = 4.10 + ((4.10 * 15)/100);
                    priceLaleta = 2.50 + ((2.50 * 15)/100);
                    price = (hrizantemiCount * priceHrizantemi) + (roziCount * priceRozi) + (laletaCount * priceLaleta);

                }else if ("N".equalsIgnoreCase(hollydayYN)) {
                    priceHrizantemi = 2.00;
                    priceRozi = 4.10;
                    priceLaleta = 2.50;
                    price = (hrizantemiCount * priceHrizantemi) + (roziCount * priceRozi) + (laletaCount * priceLaleta);
                }

            }else if ("Autumn".equalsIgnoreCase(season) || "Winter".equalsIgnoreCase(season)){
                if("Y".equalsIgnoreCase(hollydayYN)){
                    priceHrizantemi = 3.75 + ((3.75 * 15)/ 100);
                    priceRozi = 4.50 + ((4.50 * 15)/100);
                    priceLaleta = 4.15 + ((4.15 * 15)/100);
                    price = (hrizantemiCount * priceHrizantemi) + (roziCount * priceRozi) + (laletaCount * priceLaleta);

                }else if ("N".equalsIgnoreCase(hollydayYN)) {
                    priceHrizantemi = 3.75;
                    priceRozi = 4.50;
                    priceLaleta = 4.15;
                    price = (hrizantemiCount * priceHrizantemi) + (roziCount * priceRozi) + (laletaCount * priceLaleta);
                }
            }
            if (laletaCount >= 7 && "Spring".equalsIgnoreCase(season)){
                price = price - ((price * 5)/100);
            }
            if (roziCount >= 10 && "Winter".equalsIgnoreCase(season)) {
                price = price - ((price * 10)/100);
            }
            if (20 <= hrizantemiCount + roziCount + laletaCount){
                price = price - ((price * 20)/100);
              }
              double totalprice = price + aranjirane;
            System.out.printf("%.2f",totalprice);
        }
    }
