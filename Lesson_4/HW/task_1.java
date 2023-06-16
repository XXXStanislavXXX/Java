package Lesson_4.HW;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.

public class task_1 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(4, 2, -12, 4));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(-1, 3, -6, 10));
        task_1 task = new task_1();
        Deque<Integer> result = task.sum(d1, d2);
        System.out.println(result);
    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int sum = carry;
            if (!d1.isEmpty()) {
                sum += d1.pop();
            }
            if (!d2.isEmpty()) {
                sum += d2.pop();
            }
            result.addLast(sum);
        }
        return result;
    }
}
