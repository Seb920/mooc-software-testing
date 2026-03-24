package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CaesarShiftCipherTest {

    @Test
    public void testBasicShift() {
        CaesarShiftCipher cc = new CaesarShiftCipher();
        Assertions.assertEquals("def", cc.CaesarShiftCipher("abc", 3));
    }

    @Test
    public void testWrapAround() {
        CaesarShiftCipher cc = new CaesarShiftCipher();
        Assertions.assertEquals("abc", cc.CaesarShiftCipher("xyz", 3));
    }

    @Test
    public void testInvalidInput() {
        CaesarShiftCipher cc = new CaesarShiftCipher();
        Assertions.assertEquals("invalid", cc.CaesarShiftCipher("abc1", 3));
    }
}