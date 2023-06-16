package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.

public class sample_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arc1 = new int[10];
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            arc1[i] = val;
        }
        inArray(arc1);
    }

    public static void inArray(int[] array) {
        Queue<Integer> result = new LinkedList<>();
        for (int i : array) {
            result.add(i);
        }
        System.out.println(result);;
    }
}
