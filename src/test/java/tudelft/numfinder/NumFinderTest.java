package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumFinderTest {

    private NumFinder numFinder;

    @BeforeEach
    public void setUp() {
        numFinder = new NumFinder();
    }

    @Test
    public void testArrayNormal() {
        numFinder.find(new int[] {4, 25, 7, 9});
        Assertions.assertEquals(4, numFinder.getSmallest());
        Assertions.assertEquals(25, numFinder.getLargest());
    }

    @Test
    public void testArrayConNegativos() {
        numFinder.find(new int[] {4, 3, 2, 1, -7});
        Assertions.assertEquals(-7, numFinder.getSmallest());
        Assertions.assertEquals(4, numFinder.getLargest());
    }

    @Test
    public void testArrayDescendente() {
        numFinder.find(new int[] {5, 4, 3, 2, 1});
        Assertions.assertEquals(1, numFinder.getSmallest());
        Assertions.assertEquals(5, numFinder.getLargest());
    }

    @Test
    public void testArrayUnElemento() {
        numFinder.find(new int[] {42});
        Assertions.assertEquals(42, numFinder.getSmallest());
        Assertions.assertEquals(42, numFinder.getLargest());
    }
}