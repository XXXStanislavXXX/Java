package Lesson_1;

/**
 * sample_3
 */
import java.util.Scanner;
public class sample_3 {

    public static void main(String[] args) {
        String s = new String();
        s = null + "";
        String s1 = "null";
        System.out.println(s1.equals(s));
        System.out.println(s.getClass().getSimpleName());
        System.out.println(s);
        s = s + 1;
        System.out.println(s);
    }
}