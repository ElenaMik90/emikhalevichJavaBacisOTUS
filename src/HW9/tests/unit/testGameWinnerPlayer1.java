package HW9.tests.unit;

import HW9.game.Dice;
import HW9.game.DiceImpl;

public class testGameWinnerPlayer1 {
    public void testGame() {
        String scenario = "ТЕСТ3: Выиграл игрок1 Вася";
        try {
            Dice testDice = new DiceImpl();
            int dicePlayer1 = testDice.roll();
            int dicePlayer2 = testDice.roll();
            if (dicePlayer1 > dicePlayer2) {
                System.out.printf("\"%s\" пройдено %n", scenario);
            } else {
                throw new Exception("Выиграл игрок 2: " + dicePlayer1 + " < " + dicePlayer2);
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено.  \"%s\" %n", scenario, e.getMessage());
        }
    }
}

