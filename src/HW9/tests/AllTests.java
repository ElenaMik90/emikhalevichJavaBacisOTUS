package HW9.tests;

import HW9.tests.unit.GameNullTest;
import HW9.tests.unit.testDiceImpl;
import HW9.tests.unit.testDiceImplDraw;
import HW9.tests.unit.testGameWinnerPlayer1;

public class AllTests {
    public static void main(String[] args) {
        new testDiceImpl().testDice();
        new testDiceImplDraw().testDiceDraw();
        new testGameWinnerPlayer1().testGame();
        new GameNullTest().testGameNull();
    }
}

