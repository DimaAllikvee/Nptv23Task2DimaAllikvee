package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        while (number < 100 || number > 999) {
            System.out.println("Ошибка должно быть трехзначное число: ");
            number = scanner.nextInt();
        }


        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number % 10;
        int sum = a + b + c;
        System.out.println("Сумма цифр: " + sum);
    }
}
