package Lesson_1;

/**
 * sample1
 */

 import java.util.Scanner;

public class sample_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Enter name: ");
        String name = sc.next();

        // .nextLine()   --- Считывает строчку 
        // .next() --- считывает элемент
        // .nextInt() --- считывает Число

        //12 \n 
        // num = 12
        // .... sc.nextLine(); //
        System.out.printf("HI, %s", name);
        sc.close();

    }
}        