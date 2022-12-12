package HW9.tests.unit;

import HW9.game.GameWinnerPrinter;
import HW9.game.Player;

public class GameWinnerConsolePrinterTest implements GameWinnerPrinter {
    Player winner;

    @Override
    public void printWinner(Player win) {
        winner = win;
    }
}