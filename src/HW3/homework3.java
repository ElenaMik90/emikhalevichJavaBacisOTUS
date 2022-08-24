package HW3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
// Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0;
        int wrongCount = 0;
        String Answers1;
        String Answers2;
        String Answers3;
        String Answers4;
//Определение массивов
        String[] Questions = {"Назовите столицу Сербии. Указать номер варианта ответа?", "Что из перечисленного не является буквой греческого алфавита. Указать номер варианта ответа?", "Значение физической постоянной ускорения свободного падения (нормальное) в м/с^2. Указать номер варианта ответа?", "Что из перечисленного является единицей измерения силы света (СИ)?. Указать номер варианта ответа"};
        String[][] AnswerOptions = {{"1. Тиват", "2. Белгород", "3. Вране", "4. Белград"}, {"1. Φ", "2. Δ", "3. Й", "4. \u03A1"}, {"1. 0,67", "2. 273,15", "3. 9,81", "4. 1,618"}, {"1. Кандела", "2. Кельвин", "3. Моль", "4. Люкс"}};
        int[] AllAnswers = {0, 0, 0, 0};
        int[] TrueAnswers = {4, 3, 3, 1};
//Опрос пользователя
        Scanner scanner = new Scanner(System.in);//так потому что меньше затрат на создание объекта

        for (int i0 = 0; i0 < 4; i0++) {
            System.out.println(Questions[i0]);
            {
                for (int j = 0; j < 4; j++) {
                    System.out.println(AnswerOptions[i0][j] + "\n");
                }
                System.out.print("Ваш ответ: ");//Д*1 добавить проверку вводимых значений
                int number = scanner.nextInt();
                AllAnswers[i0] = number;
                if (TrueAnswers[i0] == number) {
                    ++correctCount;
                    Answers1 = "- правильно";
                } else {
                    ++wrongCount;
                    Answers1 = " - неправильно";
                }
                System.out.println("Ваш ответ: " + Answers1);
            }
        }
//Подсчёт результатов
        if (AllAnswers[0] == 4) {
            ++correctCount;
            Answers1 = "Вопрос 1 - правильно";
        } else {
            ++wrongCount;
            Answers1 = "Вопрос 1 - неправильно";
        }
        if (AllAnswers[1] == 3) {
            ++correctCount;
            Answers2 = "Вопрос 2 - правильно";
        } else {
            ++wrongCount;
            Answers2 = "Вопрос 2 - неправильно";
        }
        if (AllAnswers[2] == 3) {
            ++correctCount;
            Answers3 = "Вопрос 3 - правильно";
        } else {
            ++wrongCount;
            Answers3 = "Вопрос 3 - неправильно";
        }
        if (AllAnswers[3] == 1) {
            ++correctCount;
            Answers4 = "Вопрос 4 - правильно";
        } else {
            ++wrongCount;
            Answers4 = "Вопрос 4 - неправильно";
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount + "\n" + Answers1 + "\n" + Answers2 + "\n" + Answers3 + "\n" + Answers4);
    }
}