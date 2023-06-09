package Lesson_2;

// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd.
// Ответ: a4b3cd2

public class sample_2 {
    private static String StrComposer(String str) {
        String stroka = "";
        char c = str.charAt(0);
        Integer count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            } else {
                stroka += "" + c + count;
                c = str.charAt(i);
                count = 1;
            }
        }
        return stroka + c + count;
    }
    public static void main(String[] args) {
        String stroka = "aaaabbbcdd";
        String newStroka = StrComposer(stroka);
        System.out.println(newStroka);
    }
}
