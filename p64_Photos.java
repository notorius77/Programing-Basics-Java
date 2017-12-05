package Programing.basics;

import java.util.Scanner;

public class p64_Photos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numPhotos = Double.parseDouble(scanner.nextLine());
        String typePhotos = scanner.nextLine();
        String order = scanner.nextLine();

        double price = 0;

       if ("9X13".equalsIgnoreCase(typePhotos)) {
           price = numPhotos * 0.16;
       }else if (numPhotos >= 50 && "9X13".equalsIgnoreCase(typePhotos)) {
               price = price - ((price * 5) / 100);
       }

       if ("10X15".equalsIgnoreCase(typePhotos)) {
            price = numPhotos * 0.16;
        }else if (numPhotos >= 80 && "10X15".equalsIgnoreCase(typePhotos)){
                price = price - ((price * 3)/ 100);
        }

       if ("13X18".equalsIgnoreCase(typePhotos)) {
           price = numPhotos * 0.38;
       }else if (numPhotos >= 50 && numPhotos < 100 && "13X18".equalsIgnoreCase(typePhotos)) {
           price = price - ((price * 3) / 100);
       }else if (numPhotos >=100 && "13X18".equalsIgnoreCase(typePhotos)){
               price = price - ((price  * 5)/ 100);
       }

       if ( "20X30".equalsIgnoreCase(typePhotos)) {
           price = numPhotos * 2.90;
       }else if (numPhotos >=10 && numPhotos < 50 && "20X30".equalsIgnoreCase(typePhotos)){
               price = price - ((price * 3)/ 100);
       }else if (numPhotos > 50 && " 20X30".equalsIgnoreCase(typePhotos)){
           price = price - ((price * 5)/ 100);
       }

        if (order.equalsIgnoreCase("online")){
            price = price - ((price * 2)/100);
            System.out.printf("%.2fBGN",price);
        }else {
            System.out.printf("%.2fBGN", price);
        }
    }
}