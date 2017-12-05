package Programing.basics;

import java.util.Scanner;

public class p147_ChristmasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int dots = (n * 2)- 1;
        System.out.printf("%s/|\\%s\n",repeatString(".",dots),
                repeatString(".",dots));
        System.out.printf("%s\\|/%s\n",repeatString(".",dots),
                repeatString(".",dots));
        System.out.printf("%s***%s\n",repeatString(".",dots),
                repeatString(".",dots));
        int slash = 1;
        int dots2 = (n * 2) -2;
        for (int i = 0; i < (n * 2) - 1 ; i++) {
            System.out.printf("%s*%s*%s*%s\n",repeatString(".",dots2),
                    repeatString("-",slash),
                    repeatString("-",slash),
                    repeatString(".",dots2));
            dots2--;
            slash++;
        }
        System.out.printf("%s\n",repeatString("*", (n * 4 + 1)));
        int dotStar = n * 2;
        System.out.printf("*%s\n",repeatString(".*",dotStar));
        System.out.printf("%s",repeatString("*",(n *4 + 1)));
    }
    static String repeatString(String toRepeat, int count) {
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            text.append(toRepeat);
        }
        return text.toString();
}
}