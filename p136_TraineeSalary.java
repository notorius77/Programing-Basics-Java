package Programing.basics;

import java.util.Scanner;

public class p136_TraineeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double jelev = 0;
        double royal = 0;
        double roli = 0;
        double trofon = 0;
        double sino = 0;
        double others = 0;

        for (int i = 0; i < n ; i++) {
            String lectur = scanner.nextLine();
          if ("Jelev".equalsIgnoreCase(lectur)){
           jelev++;
          }else if ("RoYaL".equalsIgnoreCase(lectur)){
           royal++;
          }else if ("Roli".equalsIgnoreCase(lectur)){
           roli++;
          }else if ("Trofon".equalsIgnoreCase(lectur)){
           trofon++;
          }else if ("Sino".equalsIgnoreCase(lectur)){
           sino++;
          }else {
           others++;
          }
        }
        double payPerLection = budget / n;
        double payJelev = payPerLection * jelev;
        double payRoyal = payPerLection * royal;
        double payRoli = payPerLection * roli;
        double payTrofon = payPerLection * trofon;
        double paySino = payPerLection * sino;
        double payOthers = payPerLection * others;

        System.out.printf("Jelev salary: %.2f lv\n" +
                "RoYaL salary: %.2f lv\n" +
                "Roli salary: %.2f lv\n" +
                "Trofon salary: %.2f lv\n" +
                "Sino salary: %.2f lv\n" +
                "Others salary: %.2f lv",payJelev,payRoyal,payRoli,payTrofon,paySino,payOthers);
    }
}
