package com.company;

import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int massiv[] = new int[10];
        float number[] = new float[10];
        int s = 0, j = 0, k = 0;
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++)
        {
            massiv[i] = r.nextInt(21) - 10;
        }
        for (int i = 0; i < 10; i++)
        {
            s += massiv[i];
        }
        System.out.println("Сумма(цикл for):" + s);
        s = 0;
        while (j < 10)
        {
            s += massiv[j];
            j++;
        }
        System.out.println("\nСумма(цикл while):" + s);
        s = 0;
        do {
            s += massiv[k];
            k++;
        } while (k < 10);
        System.out.println("\nСумма(цикл while):" + s);
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
        System.out.println("\nГармонический ряд первые 10 чисел:\n");
        for (int i = 0; i < 10; i++)
        {
            number[i] = 1f/(1 + i);
            System.out.println(number[i] + " ");
        }
        System.out.println("\nМассив случайных чисел:\n");
        for (int i = 0; i < 10; i++)
        {
            massiv[i] = r.nextInt(21) - 10;
            System.out.println(massiv[i] + " ");
        }
        System.out.println("\nМассив случайных чисел отсортированный:\n");
        Arrays.sort(massiv);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(massiv[i] + " ");
        }
        int a, b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите число, для вычисление факториала: \n");
        a = in.nextInt();
        for(int i=a;i>0;i--){
            b*=i;
        }
        System.out.println("\nРезультат: \n" + b);
    }
}
