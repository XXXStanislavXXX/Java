package Lesson_1.HW;

public class task_4 {

    /*
     * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
     * заменены знаком вопроса, например, 2? + ?5 = 69.
     * Требуется восстановить выражение до верного равенства. Предложить хотя бы
     * одно решение или сообщить, что его нет.
     */

    static boolean Num(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        st = st.append("1");
        for (int i = 2; i < 1000; i++) {
            if (Num(i))
                st = st.append(", ").append(i);
        }
        System.out.println("This is order of simple numbers from 1 to 1000:");
        System.out.println(st);
    }
}
