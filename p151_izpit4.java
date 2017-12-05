package Programing.basics;

import java.util.Scanner;

public class p151_izpit4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kgDomati = Double.parseDouble(scanner.nextLine());
       int kasetki = Integer.parseInt(scanner.nextLine());
       int burkani = Integer.parseInt(scanner.nextLine());

        double totalLutenica = kgDomati / 5;
        double totalBurkani = totalLutenica / 0.535;
        double totalKasetki = totalBurkani /burkani;
        if (totalKasetki >= kasetki){
            double left = totalKasetki - kasetki;
            double left2 = totalBurkani - (kasetki * burkani);
            System.out.printf("Total lutenica: %s kilograms.\n%s boxes left.\n%s jars left.",
                    (int)totalLutenica,
                    (int)left,
                    (int)left2);
        }else if (totalKasetki <= kasetki){
            double left =kasetki-totalKasetki;
            double left2 =(kasetki * burkani) - totalBurkani;
            System.out.printf("Total lutenica: %s kilograms.\n%s more boxes needed.\n%s more jars needed.",
                    (int)totalLutenica,
                    (int)left,
                    (int)left2);
        }

    }
}
