package Programing.basics;

import java.util.Scanner;

public class p17_ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                double grade =Double.parseDouble(scanner.nextLine());
                if (grade >= 5.50) {
                    System.out.println("Excellent!");
                }
                else{
                    System.out.println("not excellent.");
                }
            }
        }
