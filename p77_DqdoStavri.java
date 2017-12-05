package Programing.basics;

import java.util.Scanner;

public class p77_DqdoStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sumaLitri = 0;
        double sumaDegrees = 0;
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            double litters = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            sumaLitri += litters;
            sumaDegrees = sumaDegrees + (litters * degrees);
            suma = sumaDegrees / sumaLitri;
        }

        System.out.printf("Liter: %.2f%n",sumaLitri);
        System.out.printf("Degrees: %.2f%n",suma);

        if(suma < 38){
            System.out.println("Not, good you should baking!");
        }else if(suma >= 38 && suma <= 42){
            System.out.println("Super!");
        }else if (suma > 42){
            System.out.println("Dilution with distilled water!");
        }
    }
 }

