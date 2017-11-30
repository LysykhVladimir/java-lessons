package ru.tn.courses.vlysykh.task1.v3.subtask3;

/**
 * Created by ElemenT87 on 04.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        BadArray badArray = new BadArray();
        badArray.showArray();
       long start = System.currentTimeMillis();
        badArray.bubbleSort();
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
        start = System.currentTimeMillis();
        badArray.selectionSort();
        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
         start = System.currentTimeMillis();
        badArray.insertSort();
         finish = System.currentTimeMillis();
         timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }
}
