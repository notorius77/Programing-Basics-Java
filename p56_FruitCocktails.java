package Programing.basics;

import java.util.Scanner;

public class p56_FruitCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String smallBig =scanner.nextLine().toLowerCase();
        double count = Double.parseDouble(scanner.nextLine());
        double totalPrice = 0.0;
        double price = 0.0;
        if("watermelon".equals(fruit)){
            if ("small".equals(smallBig)){
                price = (2 * 56)* count;
            }else if ("big".equals(smallBig)){
                price = (5 * 28.70)* count;
            }
        }else if("mango".equals(fruit)){
            if ("small".equals(smallBig)){
                price = (2 * 36.66) * count;
            }else if ("big".equals(smallBig)){
                price = (5 *19.600) * count;
            }
        }else if ("pineapple".equals(fruit)){
            if ("small".equals(smallBig)){
                price = (2 * 42.10) * count;
            }else if ("big".equals(smallBig)){
                price = (5 * 24.80) * count;
            }
        }else if ("raspberry".equals(fruit)){{
            if ("small".equals(smallBig)){
                price = (2 * 20) * count;
            }else if ("big".equals(smallBig)){
                price = (5* 15.20) * count;
            }
        }


        }
        if ( price >= 400 && price <=1000) {
            double totalprice = price - (price *0.15);
            System.out.printf("%.2f lv." ,totalprice);
        }else if(price > 1000){
            double totalprice = price - (price *0.5);
            System.out.printf("%.2f lv.",totalprice);
        }else {
            System.out.printf("%.2f lv.",price);
        }
    }
}