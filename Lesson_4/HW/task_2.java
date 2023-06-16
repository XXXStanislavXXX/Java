package Lesson_4.HW;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// Умножьте два числа и верните произведение в виде связанного списка.

public class task_2 {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, -3, -2));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, -4, 7, 3));
        // result [6,6,0,1]
        task_2 task = new task_2();
        Deque<Integer> result = task.multi(d1, d2);
        System.out.println(result);
    }

    public Deque<Integer> multi(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 1;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int multi = carry;
            if (!d1.isEmpty()) {
                multi *= d1.pop();
            }
            if (!d2.isEmpty()) {
                multi *= d2.pop();
            }
            result.addLast(multi);
        }
        return result;
    }
}
