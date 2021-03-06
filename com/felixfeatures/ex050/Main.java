package com.felixfeatures.ex050;

import java.util.Arrays;

/**
 * 50. В одномерном массиве переставить элементы так, чтобы сначала располагались отрицательные элементы,
 * потом нулевые, а затем положительные.
 * Относительное расположение элементов не изменять.
 */
public class Main {


    public static void main(String[] args) {
        int[] array = {0, 3, 2, 0, -1, -3, -2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortBySign(array)));
    }

    public static int[] sortBySign(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                swap(array, counter++, i);
            }
        }

        for (int i = counter; i < array.length; i++) {
            if (array[i] == 0) {
                swap(array, counter++, i);
            }
        }
        return array;
    }

    private static void swap(int array[], int index1, int index2) {
        int temp = array[index2];
        for (int i = index2; i > index1; i--) {
        	array[i] = array[i - 1];
        }
        array[index1] = temp;
    }
}
