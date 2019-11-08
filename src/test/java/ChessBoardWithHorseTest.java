import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardWithHorseTest {

    private static ChessBoardWithHorse testChessBoardWithHorse;

    @Before
    public void before (){
        System.out.println("before ...");
        testChessBoardWithHorse = new ChessBoardWithHorse();
    }

    @Test
    public void CouldHorseMoveToPosition() {
        int [] positionHorse =  {0,0};
        int [] horseMove = {2,1};

        boolean result = testChessBoardWithHorse.NotReplySymbol(positionHorse, horseMove);
        Assert.assertTrue(result);

    }

}