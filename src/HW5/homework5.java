package HW5;

import java.util.Scanner;

public class homework5 {
    public static Questions[] questionsGeneration() {
        Questions Questions1 = new Questions();
        Questions1.setTextQuestion("Вопрос 1. Назовите столицу Сербии? Указать номер варианта ответа");
        Questions Questions2 = new Questions();
        Questions2.setTextQuestion("Вопрос 2. Что из перечисленного не является буквой греческого алфавита? Указать номер варианта ответа");
        Questions Questions3 = new Questions();
        Questions3.setTextQuestion("Вопрос 3. Значение физической постоянной ускорения свободного падения (нормальное) в м/с^2? Указать номер варианта ответа");
        Questions Questions4 = new Questions();
        Questions4.setTextQuestion("Вопрос 4. Что из перечисленного является единицей измерения силы света (СИ)? Указать номер варианта ответа");
        Questions1.lines = new AnswerOptions(new String[]{"1. Тиват", "2. Белгород ", "3. Вране", "4. Белград"});
        Questions2.lines = new AnswerOptions(new String[]{"1. Φ", "2. Δ", "3. Й", "4. \u03A1"});
        Questions3.lines = new AnswerOptions(new String[]{"1. 0,67", "2. 273,15", "3. 9,81", "4. 1,618"});
        Questions4.lines = new AnswerOptions(new String[]{"1. Кандела", "2. Кельвин", "3. Моль", "4. Люкс"});
        return new Questions[]{Questions1, Questions2, Questions3, Questions4};
    }

    public static void main(String[] arg) {
        int correctCount = 0;
        int wrongCount = 0;
        String text;
        int[] trueAnswers = {4, 3, 3, 1};
        int number = 0;

        Scanner scanner = new Scanner(System.in);
        Questions[] questions = questionsGeneration();
        int sizeQuestions = questions.length;


        for (int i = 0; i < sizeQuestions; i++) {
            Questions currentQuestions = questions[i];
            System.out.println(currentQuestions.getTextQuestion());
            int sizeAnswer = currentQuestions.lines.textAnswer.length;
            for (int j = 0; j < sizeAnswer; j++) {
                System.out.println(currentQuestions.lines.textAnswer[j]);
            }

            System.out.println("Ваш вариант ответа");

            if (scanner.hasNextInt()) {
                while (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    if (number > 0 && number < 5) {
                        break;
                    } else {
                        System.out.println("Повторите ввод, такого варианта ответа нет!");
                        for (; number < 0 && number > 5; ) {
                            number = scanner.nextInt();
                        }
                    }
                }
            } else {
                System.out.println("\nНеобходимо вводить числа. Программа завершена");
                break;
            }

            if (trueAnswers[i] == number) {
                correctCount++;
                text = "правильно\n ----------------------";
            } else {
                wrongCount++;
                text = "неправильно\n ----------------------";
            }
            System.out.println(text);
        }
        System.out.println("\nРезультат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
