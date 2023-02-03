package HW9.tests.unit;

import HW9.game.*;

public class GameNullTest {
    public void testGameNull() {
        String scenario = "ТЕСТ4: В метод Game нельзя передать null.";
        try {
            Game game = new Game(null, null);
            game.playGame(new Player("Вася"), new Player("Игорь"));
            System.out.printf("\"%s\" пройдено %n", scenario);
            } catch (Exception e) {
            System.err.printf("\"%s\" не пройдено, в метод переданы пустые значения.  \"%s\" %n", scenario, e.getMessage());
        }
    }
}

