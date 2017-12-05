package Programing.basics;

import java.util.Scanner;

public class p25_NumberFrom100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readMe = Integer.parseInt(scanner.nextLine());
        if ( readMe < 100){
            System.out.println("Less than 100");
        }else if (readMe >=100 && readMe <=200 ){
            System.out.println("Between 100 and 200");
        }else {
            System.out.println("Greater than 200");
        }
    }
}
