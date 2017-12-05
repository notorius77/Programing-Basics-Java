package Programing.basics;

import java.util.Scanner;

public class p143_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        double everyGrade = 0;
        double parcentE= 0;
        double parcentD= 0;
        double parcentB= 0;
        double parcentA= 0;
        for (int i = 0; i <students ; i++) {
            double grades = Double.parseDouble(scanner.nextLine());
            everyGrade+= grades;
            if(grades >= 2 && grades <= 2.99 ){
               parcentE++;
            }else if (grades >=3 && grades <= 3.99){
              parcentD++;
            }else if (grades >= 4 && grades <= 4.99){
              parcentB++;
            }else if (grades >= 5){
              parcentA++;
            }
        }
        everyGrade = everyGrade / students;
        double parcentTop =  parcentA / students * 100;
        double parcentGood = parcentB /students * 100;
        double parcentWeek = parcentD / students * 100;
        double parcentFails = parcentE / students * 100;
        System.out.printf("Top students: %.2f%%\nBetween 4.00 and 4.99: %.2f%%\nBetween 3.00 and 3.99: %.2f%%\nFail: %.2f%%\nAverage: %.2f",
                parcentTop,
                parcentGood,
                parcentWeek,
                parcentFails,
                everyGrade);
    }
}
