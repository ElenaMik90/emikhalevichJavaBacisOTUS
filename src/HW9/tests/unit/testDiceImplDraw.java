package HW9.tests.unit;

import HW9.game.Game;
import HW9.game.Player;

public class testDiceImplDraw {
    public static void testDiceDraw() {
        String scenario = "ТЕСТ2: В игре должен быть победитель";
        try {
            DiceImplTest testDice = new DiceImplTest();
            GameWinnerConsolePrinterTest winnerPrinterTest = new GameWinnerConsolePrinterTest();
            Player player1 = new Player("Вася");
            Player player2 = new Player("Игорь");
            Game gameTest = new Game(testDice, winnerPrinterTest);
            gameTest.playGame(player1, player2);
            if (winnerPrinterTest.winner == null)
                System.out.printf("\"%s\" пройдено %n", scenario);
            else {
                throw new Exception("Победителей нет, выпало одинаковое знаение: ");
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }

    }
}