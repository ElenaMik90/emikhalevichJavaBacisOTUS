package HW9.tests.unit;

import HW9.game.GameWinnerPrinter;
import HW9.game.Player;

public class GameWinnerConsolePrinterTest implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {

        System.out.printf("Победитель: %s%n Игрок 1" );
;
    }
}