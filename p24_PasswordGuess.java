package Programing.basics;

import java.util.Scanner;

public class p24_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String pass = "s3cr3t!P@ssw0rd" ;
        String readME = scanner.nextLine();
        if(readME.equals(pass)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

    }
}
