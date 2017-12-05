package Programing.basics;

import java.util.Scanner;

public class p54_Scollership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double avGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socScholarship = 0.0;
        double gradeScholarship = 0.0;

        if (income<=minSalary && avGrade>4.50 && avGrade<5.50) {
            socScholarship = minSalary * 0.35;
        } else if (avGrade>=5.50) {
            gradeScholarship = avGrade*25;
        }

        if (socScholarship>gradeScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socScholarship));
        } else if (socScholarship<gradeScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(gradeScholarship));
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}