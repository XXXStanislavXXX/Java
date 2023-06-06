package Lesson_1.HW;

import java.util.Scanner;

public class task_1 {

    /*
     * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
     * чисел от 1 до n)
     */

    static int Triang(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int Fac(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Enter natural number: ");
        if (!scn.hasNextInt()) {
            System.out.println("You entered wrong number!!!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("You should enter positive number only!!!");
            else {
                System.out.printf("The triangle number of %d is: %s! ", n, Triang(n));
                System.out.println();
                System.out.printf("The factorial of %d is: %s! ", n, Fac(n));
            }
        }
        scn.close();
    }
}
