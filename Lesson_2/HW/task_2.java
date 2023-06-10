
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// 1 3 4 2
// 1 3 2 4
// 1 2 3 4

package Lesson_2.HW;

import java.io.IOException;
import java.util.logging.*;

public class task_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_2.class.getName());
        FileHandler fh = new FileHandler("Lesson_2\\HW\\logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = { 1, 3, 4, 2, -2, 0, 17, 3, 3, 22, -13, -12, 0 };
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }

    public static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

}
