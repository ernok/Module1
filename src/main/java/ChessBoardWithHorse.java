import java.util.ArrayList;

public class ChessBoardWithHorse {

    public boolean NotReplySymbol(int[] positionHorse, int[] horseMove) {

        int counterMove = 0;

        for (int i = 0; i < horseMove.length; i++) {
            if (positionHorse[i] > 8 || horseMove[i] > 8 || positionHorse[i] <0 || (positionHorse[i]+horseMove[i] <0)) {
                return false;
            }
            if (Math.abs(horseMove[i] - positionHorse[i]) == counterMove)  {
                return true;
            }
            if (Math.abs(horseMove[i] - positionHorse[i]) == 1)  {
                counterMove = 2;
            }
            if (Math.abs(horseMove[i] - positionHorse[i]) == 2)  {
                counterMove = 1;
            }
        }

        return false;
    }
}
