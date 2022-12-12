package HW9.tests.unit;

import HW9.game.Dice;

//import java.util.Iterator;

public class DiceImplTest2 implements Dice {
    int actaual = 0;
    @Override

    public int roll() {
        int a = 0;
        if (actaual == 0) {
            a = 6;
        } else
            a = 1;
        ++ actaual;
        return a;
    }


}


