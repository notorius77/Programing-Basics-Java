package Programing.basics;

import java.util.Scanner;

public class p83_SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 1 ; j++){// tuk moje i da zamesim "n-1" s vutre6niq cikul j da zapo4va ot vtorata
                //poziviq v slu4eq (j = 1) i togava j < n

                System.out.print(" *");

            }
            System.out.println();
        }




    }
}