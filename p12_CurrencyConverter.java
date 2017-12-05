package Programing.basics;

import java.util.Scanner;


public class p12_CurrencyConverter {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        double sum = Double.parseDouble(console.nextLine());
        String value1 = console.nextLine();
        String value2 = console.nextLine();
        if (value1.equals("USD")){
            sum = sum*1.79549;
        }else if(value1.equals("EUR")){
            sum = sum * 1.95583;
        }else if(value1.equals("GBP")){
            sum = sum * 2.53405;
        }else if(value1.equals("BGN")){
            sum= sum*1;
        }
        if(value2.equals("USD")){
            sum = sum/1.79549;
        }else if(value2.equals("EUR")){
            sum = sum/1.95583;
        }else if(value2.equals("GBP")){
            sum = sum/2.53405;
        }else if(value2.equals("BGN")){
            sum = sum/1;
        }
        System.out.printf("%.2f %s",sum,value2);
    }

}