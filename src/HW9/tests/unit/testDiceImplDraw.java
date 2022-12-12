package HW9.tests.unit;
import HW9.game.Dice;

public class testDiceImplDraw {
    public static void testDiceDraw() {
        String scenario = "ТЕСТ2: Должен быть победитель";
        try {
            Dice testDice = new DiceImplTest();
            int dicePlayer1 = testDice.roll();
            int dicePlayer2 = testDice.roll();
            if (dicePlayer1 != dicePlayer2) {
                System.out.printf("\"%s\" пройдено %n", scenario);
            }
            else {
                throw new Exception("Победителей нет, выпало одинаковое знаение: " + dicePlayer1 + " = " + dicePlayer2);
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено.  \"%s\" %n", scenario, e.getMessage());
        }
    }
}

