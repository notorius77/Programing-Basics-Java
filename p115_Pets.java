package Programing.basics;

import java.util.Scanner;

public class p115_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double foodKgDog = Double.parseDouble(scanner.nextLine());
        double foodKgCat = Double.parseDouble(scanner.nextLine());
        double foodGrTutle = Double.parseDouble(scanner.nextLine());


        double totalfood = (days * foodKgDog) + (days * foodKgCat) + (days * foodGrTutle / 1000);

         double needed = 0;
         double left =0;
        if(totalfood >= foodKg){
            left = totalfood - foodKg;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(left));
        }else {
            needed = foodKg - totalfood;
            System.out.printf("%.0f kilos of food left.",Math.floor(needed));
        }
    }
}
