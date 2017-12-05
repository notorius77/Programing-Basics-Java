package Programing.basics;

import java.util.Scanner;

public class p61_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String srok = scanner.nextLine().toLowerCase();
        String tip = scanner.nextLine().toLowerCase();
        String internet = scanner.nextLine().toLowerCase();
        double broi = Double.parseDouble(scanner.nextLine());

        double totalprice = 0.0;
        double price = 0.0;
        if (srok.equals("one")){
            if(tip.equals("small") && internet.equals("no")){
            price = 9.98;
            }else if (tip.equals("middle") && internet.equals("no")){
                price = 18.99;
            }else if (tip.equals("large") && internet.equals("no")){
                price = 25.98;
            }else if (tip.equals("extralarge") && internet.equals("no")) {
                price = 35.99;
            }else if (tip.equals("small") && internet.equals("yes")){
                price = 9.98 + 5.50;
            }else if (tip.equals("middle") && internet.equals("yes")){
                price = 10.89 + 4.35;
            }else if (tip.equals("large") && internet.equals("yes")){
                price = 25.98 + 4.35;
            }else if (tip.equals("extralarge") && internet.equals("yes")){
                price = 35.99 + 3.85;
            }
            totalprice = price * broi;

        }else if (srok.equals("two")){
            if(tip.equals("small") && internet.equals("no")){
                price = 8.58;
            }else if (tip.equals("middle") && internet.equals("no")){
                price = 17.09;
            }else if (tip.equals("large") && internet.equals("no")){
                price = 23.59;
            }else if (tip.equals("extralarge") && internet.equals("no")) {
                price = 31.79;
            }else if (tip.equals("small") && internet.equals("yes")){
                price = 8.58 + 5.50;
            }else if (tip.equals("middle") && internet.equals("yes")){
                price = 17.09 + 4.35;
            }else if (tip.equals("large") && internet.equals("yes")){
                price = 23.59 + 4.35;
            }else if (tip.equals("extralarge") && internet.equals("yes")){
                price = 31.79 + 3.85;
            }
            totalprice = price * broi;
        }
        if (srok.equals("two")){
            totalprice = totalprice - (totalprice * 0.0375);
            System.out.printf("%.2f lv.",totalprice);
        }else {
            System.out.printf("%.2f lv.",totalprice);
        }
    }
}
