package HW4;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        int correctCount = 0;
        int wrongCount = 0;
        String text;
        String[] Questions = {"Назовите столицу Сербии. Указать номер варианта ответа?", "Что из перечисленного не является буквой греческого алфавита. Указать номер варианта ответа?", "Значение физической постоянной ускорения свободного падения (нормальное) в м/с^2. Указать номер варианта ответа?", "Что из перечисленного является единицей измерения силы света (СИ)?. Указать номер варианта ответа"};
        String[][] AnswerOptions = {{"1. Тиват", "2. Белгород", "3. Вране", "4. Белград"}, {"1. Φ", "2. Δ", "3. Й", "4. \u03A1"}, {"1. 0,67", "2. 273,15", "3. 9,81", "4. 1,618"}, {"1. Кандела", "2. Кельвин", "3. Моль", "4. Люкс"}};
        int[] AllAnswers = {0, 0, 0, 0};
        int[] TrueAnswers = {4, 3, 3, 1};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Questions.length; i++) {
            System.out.println(Questions[i]);
            {
                for (int j = 0; j < AnswerOptions[i].length; j++) {
                    System.out.println(AnswerOptions[i][j]);
                }
                System.out.print("Ваш вариант ответа: ");//Д*1 добавить проверку вводимых значений
                int number = scanner.nextInt();
                AllAnswers[i] = number;
                if (TrueAnswers[i] == number) {
                    correctCount++;
                    text = "правильно\n ----------------------";
                } else {
                    wrongCount++;
                    text = "неправильно\n ----------------------";
                }
                System.out.println(text);
            }
        }
        System.out.println("\nРезультат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}