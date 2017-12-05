package Programing.basics;

import java.util.Scanner;

public class p148_izpit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double n = Double.parseDouble(scanner.nextLine());

        double poor = 0;
        double satisfactry = 0;
        double good = 0;
        double veryGood = 0;
        double excellent = 0;
        for (int i = 0; i < n ; i++) {
            double points = Double.parseDouble(scanner.nextLine());
            if (points >= 0 && points <=22.5){
              poor++;
            }else if (points > 22.5 && points <=40.5){
             satisfactry++;
            }else if (points > 40.5 && points <= 58.5){
             good++;
            }else if (points> 58.5 && points <= 76.5){
             veryGood++;
            }else if (points > 76.5 && points <= 100){
                excellent++;
            }
        }
        double parcentPoor = (poor / n * 100);
        double parcentSatisfactry = (satisfactry / n * 100);
        double parcentGood = (good / n * 100);
        double parcentVerygood = (veryGood / n * 100);
        double parcentExcellent = (excellent / n * 100);
        System.out.printf("%.2f%% poor marks\n%.2f%% satisfactory marks\n%.2f%% good marks\n%.2f%% very good marks\n%.2f%% excellent marks",
                parcentPoor,
                parcentSatisfactry,
                parcentGood,
                parcentVerygood,
                parcentExcellent);
    }
}
