package HW5;

import java.util.Scanner;

public class homework5 {
    static Questions[] questionsGeneration() {
        Questions questions1 = new Questions();
        questions1.setTextQuestion("Вопрос 1. Назовите столицу Сербии? Указать номер варианта ответа");
        Questions questions2 = new Questions();
        questions2.setTextQuestion("Вопрос 2. Что из перечисленного не является буквой греческого алфавита? Указать номер варианта ответа");
        Questions questions3 = new Questions();
        questions3.setTextQuestion("Вопрос 3. Значение физической постоянной ускорения свободного падения (нормальное) в м/с^2? Указать номер варианта ответа");
        Questions questions4 = new Questions();
        questions4.setTextQuestion("Вопрос 4. Что из перечисленного является единицей измерения силы света (СИ)? Указать номер варианта ответа");
        questions1.lines = new AnswerOptions(new String[]{"1. Тиват", "2. Белгород ", "3. Вране", "4. Белград"}, 4);
        questions2.lines = new AnswerOptions(new String[]{"1. Φ", "2. Δ", "3. Й", "4. \u03A1"}, 3);
        questions3.lines = new AnswerOptions(new String[]{"1. 0,67", "2. 273,15", "3. 9,81", "4. 1,618"}, 3);
        questions4.lines = new AnswerOptions(new String[]{"1. Кандела", "2. Кельвин", "3. Моль", "4. Люкс"}, 1);
        return new Questions[]{questions1, questions2, questions3, questions4};
    }

    public static void main(String[] arg) {
        int correctCount = 0;
        int wrongCount = 0;
        String text;
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
            if (currentQuestions.lines.getResult() == number) {
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
