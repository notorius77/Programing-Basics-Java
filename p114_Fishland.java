package Programing.basics;

import java.util.Scanner;

public class p114_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriqKG = Double.parseDouble(scanner.nextLine());
        double cacaKG = Double.parseDouble(scanner.nextLine());
        double palamudKG = Double.parseDouble(scanner.nextLine());
        double safridKG = Double.parseDouble(scanner.nextLine());
        double midiKG = Double.parseDouble(scanner.nextLine());


         double pricePalamud = skumriqKG + (skumriqKG * 0.60);
         double sumPalamud = palamudKG * pricePalamud;
         double priceSafrid = cacaKG + (cacaKG * 0.80);
         double sumSafrid = safridKG * priceSafrid;
         double Midi = 7.50;
         double priceMidi = midiKG * Midi;

         double totalPrice = sumPalamud +sumSafrid + priceMidi;

        System.out.printf("%.2f",totalPrice);
    }
}
