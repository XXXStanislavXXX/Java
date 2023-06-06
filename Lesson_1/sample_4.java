package Lesson_1;

/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1],
 * вывести максимальное количество подряд идущих 1.
 */
public class sample_4 {

    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int current = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                current += 1;
            } else {
                if (current > count) {
                    count = current;
                }
                current = 0;
            }
        }
        if (current > count) {
            count = current;
        }
        System.out.println(count);

    }
}