package ru.tn.courses.vlysykh.task1.v3.subtask3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ElemenT87 on 04.03.2017.
 */

public class BadArray {
    public static final int SIZE = 200;
    public static final int BOUND = 100;
    private int [] numbers;

    public BadArray() {
        Random rnd = new Random();
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = rnd.nextInt(BOUND);
        }
        this.numbers = array;
    }

    public void showArray() {
        System.out.println(Arrays.toString(this.numbers));
    }

    public void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void swap(int[] array, int one, int two) {
        int tmp = array[one];
        array[one]=array[two];
        array[two]=tmp;
    }

    public void bubbleSort(){
        int [] sorted = Arrays.copyOf(numbers, numbers.length);
        int count = 0;
        for (int out=sorted.length-1; out>1; out--){
            for (int in=0; in<out; in++){
                if (sorted[in] > sorted[in+1]) {
                   swap(sorted, in,in+1);
                   count++;
                }
            }
        }
        System.out.println();
        System.out.println("Массив отсортирован методом перестановок.");
        System.out.println("Общее количество перестановок:  "+count);
        showArray(sorted);
    }

    public void selectionSort() {
        int[] array = Arrays.copyOf(numbers,numbers.length);
        int min;
        int count = 0;
        for (int out=0; out<array.length-1; out++){
            min=out;
            for (int in=out+1; in<array.length; in++){
                if (array[in]<array[min]) {
                    min=in;
                }
            }
            if(array[out]>array[min]){
                swap(array,out,min);
                count++;
            }
        }
        System.out.println();
        System.out.println("Массив отсортирован методом выбора.");
        System.out.println("Общее количество перестановок:  "+count);
        showArray(array);
    }

    public void insertSort() {
        int[] array = Arrays.copyOf(numbers,numbers.length);
        int in, out;

        for (out=1; out<array.length-1; out ++){
            int temp = array[out];
            in=out;
            while (in>0 && array[in-1]>=temp){
                array[in]=array[in-1];
                --in;
            }
            array[in]=temp;
        }

        System.out.println();
        System.out.println("Массив отсортирован методом вставки.");
        showArray(array);
    }
}