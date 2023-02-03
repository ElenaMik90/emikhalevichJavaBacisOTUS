package HW9.tests.unit;
import HW9.game.Game;
import HW9.game.Player;

public class testGameWinnerPlayer1 {
    public void testGame() {
        String scenario = "ТЕСТ3: Должен выиграть первый игрок";
        try {
            DiceImplTest2 testDice = new DiceImplTest2();
            GameWinnerConsolePrinterTest winnerPrinterTest = new GameWinnerConsolePrinterTest();
            Player winPlayer = new Player("Вася");
            Player loserPlayer = new Player("Игорь");
            Game game = new Game(testDice, winnerPrinterTest);

            game.playGame(winPlayer, loserPlayer);

            if (winnerPrinterTest.winner == winPlayer){
                System.out.printf("\"%s\" пройдено. %n", scenario);}
            else {
                throw new Exception("Выиграл игрок 2: " + loserPlayer.getName());
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено. \"%s\" %n", scenario, e.getMessage());
        }
    }
}

