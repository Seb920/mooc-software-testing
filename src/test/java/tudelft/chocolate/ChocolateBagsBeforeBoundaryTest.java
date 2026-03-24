package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        ChocolateBags cb = new ChocolateBags();
        Assertions.assertEquals(2, cb.calculate(5, 3, 17));
    }

    @Test
    public void onlySmallBars() {
        ChocolateBags cb = new ChocolateBags();
        Assertions.assertEquals(3, cb.calculate(4, 2, 3));
    }
}
