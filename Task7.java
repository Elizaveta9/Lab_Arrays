package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.print("Введите кол-во элементов >> ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i != arr.length; i++) {
            int rnd = (int) (Math.random() * 200 - 100);
            if (rnd == 0) {
                i--;
                continue;
            }
            if (rnd != 0)
                arr[i] = rnd;
        }
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        BigInteger p1 = BigInteger.valueOf(1);
        BigInteger p2 = new BigInteger("1");
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] < 0)
                p1 = p1.multiply(BigInteger.valueOf(arr[i]));
            else if (arr[i] > 0)
                p2 = p2.multiply(BigInteger.valueOf(arr[i]));
        }
        System.out.printf("\nПроизведение отрицательных = %d; \nПроизведение положительных = %d", p1, p2);
        int isbigger = p1.compareTo(p2);
        if (isbigger == 1)
            System.out.println("\nМодуль произведения отрицательных чисел больше.");
        else if (isbigger == -1)
            System.out.println("\nМодуль произведения положительных чисел больше.");
        else System.out.println("\nМодули произведений равны.");
    }

}


