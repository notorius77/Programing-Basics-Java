package Programing.basics;

import java.util.Scanner;

public class p85_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
//po dulgiq variant na koda
//        //purvi red
//        System.out.print("+");
//        for (int i = 0; i < n - 2 ; i++) {
//            System.out.print(" -");
//        }
//        System.out.print(" +");
//        System.out.println();
//
//
//        //posleden red
//        System.out.print("+");
//        for (int i = 0; i < n - 2 ; i++) {
//            System.out.print(" -");
//        }
//        System.out.print(" +");
        String firstLastrow = "+";
        for (int i = 0; i < n - 2; i++) {
            firstLastrow = firstLastrow + " -";
        }
        firstLastrow += " +";
        System.out.println(firstLastrow);

        String mpart = "|";
        for (int i = 0; i < n - 2; i++) {
            mpart = mpart + " -";
        }
        mpart += " |";
        for (int i = 0; i <n -2 ; i++) {
            System.out.println(mpart);
        }

        System.out.println(firstLastrow);
    }
}
