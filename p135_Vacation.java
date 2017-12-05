package Programing.basics;

import java.util.Scanner;

public class p135_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        if ( budget <= 1000){
            if ("summer".equalsIgnoreCase(season)){
               price = ((budget * 65)/100);
                System.out.printf("Alaska - Camp - %.2f",price);
            }else if ("winter".equalsIgnoreCase(season)){
                price = ((budget * 45)/100);
                System.out.printf("Morocco - Camp - %.2f",price);
            }
        }else if (budget > 1000 && budget <= 3000){
            if ("summer".equalsIgnoreCase(season)){
                price = ((budget * 80)/100);
                System.out.printf("Alaska - Hut - %.2f",price);
            }else if ("winter".equalsIgnoreCase(season)){
                price = ((budget * 60)/100);
                System.out.printf("Morocco - Hut - %.2f",price);
            }
        }else if (budget > 3000){
            if ("summer".equalsIgnoreCase(season)){
                price = ((budget * 90)/100);
                System.out.printf("Alaska - Hotel - %.2f",price);
            }else if ("winter".equalsIgnoreCase(season)){
                price = ((budget * 90)/100);
                System.out.printf("Morocco - Hotel - %.2f",price);
            }

        }
    }
}
