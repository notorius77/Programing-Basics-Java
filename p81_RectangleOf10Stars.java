package Programing.basics;

public class p81_RectangleOf10Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(repetStr("*",10));
        }
    }
    static String repetStr(String str, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count ; i++) {
             sb.append(str);
        }
        return  sb.toString();
    }
}
