package Lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class sample_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        long time_start = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(0,val);
        }
        Long time_end = System.currentTimeMillis();
        System.out.println(time_end-time_start);

        long time_start3 = System.currentTimeMillis();
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            int val = rnd.nextInt(-100, 100);
            list3.add(0,val);
        }
        Long time_end3 = System.currentTimeMillis();
        System.out.println(time_end3-time_start3);
    }
}