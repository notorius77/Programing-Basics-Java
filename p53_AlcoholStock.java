package Programing.basics;

import java.util.Scanner;

public class p53_AlcoholStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double WhiskyPrice = Double.parseDouble(scanner.nextLine());
        double LittersBeer = Double.parseDouble(scanner.nextLine());
        double LittersWine = Double.parseDouble(scanner.nextLine());
        double LittersRakia = Double.parseDouble(scanner.nextLine());
        double LittersWhisky = Double.parseDouble(scanner.nextLine());

        double RakiaPrice = WhiskyPrice / 2;
        double WinePrice = RakiaPrice -( 0.4 * RakiaPrice);
        double BeerPrice = RakiaPrice -( 0.8 * RakiaPrice);
        double SumRakia = LittersRakia * RakiaPrice;
        double SumWine = LittersWine * WinePrice;
        double SumBeer = LittersBeer * BeerPrice;
        double SumWhisky = LittersWhisky * WhiskyPrice;
        double Total = SumRakia + SumWine + SumBeer + SumWhisky;

        System.out.printf(" %.2f",Total);

    }
}
