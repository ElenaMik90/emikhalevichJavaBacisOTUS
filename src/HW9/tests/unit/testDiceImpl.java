package HW9.tests.unit;

import HW9.game.DiceImpl;

public class testDiceImpl {
    public static void testDice() {
        String scenario = "ТЕСТ1: Выпавшение значение должно быть в диапозоне от 1 до 6";
        try {
            int min = 1;
            int max = 6;
            DiceImpl testDice = new DiceImpl();
            int roll = testDice.roll();
            if (min <= roll & max >= roll) {
                System.out.printf("\"%s\" пройдено %n", scenario);
            } else {
                throw new Exception("Выпавшее значение не входит в диапозон от 1 до 6: " + roll);
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }
    }
}
