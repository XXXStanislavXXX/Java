package Lesson_1;

import java.util.Arrays;

// Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//  а остальные - равны ему.

// [2 4 1 5 3 3 3 3 3]

// Работать разрешается только с 1 массивом.

public class sample_5 {
    public static void main(String[] args) {
        int[] array = new int[] {3,2,4,3,3,1,5,3,3};
        int val = 3;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != val) {
                array[counter] = array[i];
                array[i] = val;
                counter += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }    
}