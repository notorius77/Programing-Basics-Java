package Programing.basics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000days {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        date = date.plusDays(999);
        System.out.printf("%s",date.format(formatter));
    }
}
