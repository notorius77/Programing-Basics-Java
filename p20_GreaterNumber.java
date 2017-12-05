package Programing.basics;

import java.util.Scanner;

public class p20_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber > secondNumber){
            System.out.println(firstNumber);
        }else {
            System.out.println(secondNumber);
        }
    }
}
