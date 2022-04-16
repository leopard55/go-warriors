package com.leopard;

import java.util.Arrays;

public class bArray {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //数组的长度是固定的
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 3; //ArrayIndexOutOfBoundsException
        System.out.println(numbers); //[I@1540e19d
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {2, 3, 5, 1, 4};
        System.out.println(numbers1.length);
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        final float PI = 3.14F;
    }

    public static void multArray() {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));

        int[][] numbers1 = { {1, 2, 3}, {4, 5, 6} };
        
    }
}
