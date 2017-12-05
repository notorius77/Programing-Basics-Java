package Programing.basics;

import java.util.Scanner;

public class p26_EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readMe1 = scanner.nextLine();
        String readMe2 = scanner.nextLine();
        readMe1 = readMe1.toLowerCase();
        readMe2 = readMe2.toLowerCase();
        if ( readMe1.equals(readMe2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
