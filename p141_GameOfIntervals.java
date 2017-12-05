package Programing.basics;

import java.util.Scanner;

public class p141_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMoves =Integer.parseInt(scanner.nextLine());

        double result = 0;
        double one = 0;
        double two = 0;
        double tree = 0;
        double four = 0;
        double five = 0;
        double six = 0;
        double count1 =0;
        double count2 =0;
        double count3 =0;
        double count4 =0;
        double count5 =0;
        double count6 =0;
        double everyResult = 0;
        for (int i = 0 ; i < totalMoves ; i++) {
            double numChecked = Integer.parseInt(scanner.nextLine());
            result+= numChecked;
            if (numChecked >=0 && numChecked <=9){
               one = ((numChecked * 20)/100);
               everyResult += one;
               count1++;
            }else if(numChecked >10 && numChecked <=19){
                two = ((numChecked * 30)/100);
                everyResult += two;
                count2++;
            }else if (numChecked > 20 && numChecked <= 29){
              tree = ((numChecked * 40)/100);
              everyResult += tree;
              count3++;
            }else if (numChecked > 30 && numChecked <= 39){
                   four += 50;
                   everyResult += four;
                   count4++;
            }else if ( numChecked > 40 && numChecked <= 50){
                five += 100;
                everyResult+= five;
                count5++;
            }else {
               six = everyResult/ 2;
               everyResult+=six;//////nedovur6ena zada4a smqtaniqta sa greshni
               count6++;
            }
        }

        System.out.println(everyResult);
        System.out.printf("From 0 to 9: %s\nFrom 10 to 19: %s%%\nFrom 20 to 29: %s%%\nFrom 30 to 39: %s%%\nFrom 40 to 50: %s%%\nInvalid numbers: %s%%",
                count1,count2,count3,count4,count5,count6);

    }
}
