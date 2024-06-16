package src.lesson3;

import java.util.Scanner;

public class Main {
    private static int x;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println(x);
//        switchChanel();
        int x = 345; // шаг 1
        int y = 836; // шаг 2
        int number = sum(x, y); // шаг 3

        System.out.println("Результат сложения: " + number); // шаг 6
    }
//    public  static  void switchChanel() {
//        System.out.println("канал переключен!");

    public  static  int sum(int x, int y) {
        return x + y;
    }


}
