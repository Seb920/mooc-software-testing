package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GHappyTest {

    @Test
    public void testHappyG() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx"));
    }

    @Test
    public void testUnhappyG() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }

    @Test
    public void testMixedG() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }
}

