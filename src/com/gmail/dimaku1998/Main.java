/*2) Написать код для возможности создания массива целых чисел (размер
вводиться с клавиатуры) и возможности заполнения каждого его элемента
вручную. Выведите этот массив на экран. */
package com.gmail.dimaku1998;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number array = ");
        byte lengthA = sc.nextByte();
        int[] array = new int[lengthA];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[ " + i + " ] = ");
            array[i] = sc.nextInt();
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println(Arrays.toString(array));
    }
}
