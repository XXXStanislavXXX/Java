package Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text

// 1. Нужно сохранить text в связный список.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// 3. Выход из программы - exit


// qwe
// [qwe]
// tre
// [qwe, tre]
// zxc
// [qwe, tre, zxc]
// print~1
// tre
// [qwe, zxc]
// print~1
// zxc
// [qwe]

public class sample_2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter your line ");
            String stroka = in.nextLine();
            LinkedList<String> list1 = new LinkedList<String>();
            while (!stroka.equals("exit")) {
                if (stroka.startsWith("print~")) {
                    int value = Integer.parseInt(stroka.split("~")[1]);
                    list1.remove(value);
                }
                else{
                    list1.add(stroka);
                }
                System.out.println(list1);
                System.out.println("Enter your line ");
                stroka = in.nextLine();
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
