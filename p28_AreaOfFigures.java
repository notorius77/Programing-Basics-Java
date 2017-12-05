package Programing.basics;

import java.util.Scanner;

public class p28_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String figure = scanner.nextLine();
       double area = 0.0;
       if (figure.equals("square")){
           double side = Double.parseDouble(scanner.nextLine());
           area = side * side;
          System.out.println("Input side");
       }else if (figure.equals("rectangle")){
           double side1 = Double.parseDouble(scanner.nextLine());
           double side2 = Double.parseDouble(scanner.nextLine());
           area = side1 * side2;
           System.out.println("input side1");
           System.out.println("input side2");
       }else if (figure.equals("circle")){
           double r = Double.parseDouble(scanner.nextLine());
           area = Math.PI * r * r;
           System.out.println(" input r");
       }else if (figure.equals("triangle")){
           double side11 = Double.parseDouble(scanner.nextLine());
           double hight = Double.parseDouble(scanner.nextLine());
           area = side11 * hight / 2;
           System.out.println(" input side");
           System.out.println("input hight");
       }
       System.out.printf(" %.3f", area);


    }
}
