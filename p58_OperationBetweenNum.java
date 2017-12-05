package Programing.basics;

import java.util.Scanner;

public class p58_OperationBetweenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        String evenOdd = "";
        double result = 0;

        if ("+".equals(operation) && "-".equals(operation) && "*".equals(operation) ){
            if (operation.equals("+")){
                result = n1 + n2;
            }else if (operation.equals("-")){
                result = n1 - n2;
            }else if (operation.equals("*")){
                result = n1 * n2 ;
            }
            if (result % 2== 0){
                evenOdd = "- even";
            }else {
                evenOdd = "- odd";
            }
            System.out.printf("%d %s %d = %d %s",n1,operation,n2,result,evenOdd);
        }else if ("/".equals(operation) && "%".equals(operation)){
            if (n2 == 0 ){
                System.out.printf("Cannot divide %d by zero",n1);
            }else if ("/".equals(operation)){
                System.out.printf("%d %s %d = %.2f %d ",n1,operation,n2,result);
            }else if ("%".equals(operation)){
                System.out.printf("&d &s &d = %d",n1,operation,n2,result);
            }
        }
    }
}
