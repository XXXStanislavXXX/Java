package Lesson_4;

import java.util.Scanner;
import java.util.Stack;

// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней и чистит весь перечень.
// qwe
// [qwe]
// tre
// [qwe, tre]
// zxc
// [qwe, tre, zxc]
// print
// zxc, tre, qwe
// []

public class sample_3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your line ");
            String stroka = in.nextLine();
            Stack<String> list1 = new Stack<String>();
            while (!stroka.equals("exit")) {
                if (stroka.equals("print")) {
                    while (!list1.empty()) {
                        System.out.println(list1.pop());
                    }
                } else {
                    list1.push(stroka);
                }
                System.out.println(list1);
                System.out.println("Enter your line ");
                stroka = in.nextLine();
            }
        }
    }
}
