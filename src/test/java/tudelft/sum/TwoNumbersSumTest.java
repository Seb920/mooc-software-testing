package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TwoNumbersSumTest {

    private final TwoNumbersSum calc = new TwoNumbersSum();

    @Test
    void sumarNumerosSimples() {
        // 12 + 3 = 15
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3));
        assertEquals(Arrays.asList(1, 5), calc.addTwoNumbers(first, second));
    }

    @Test
    void sumarConAcarreo() {
        // 19 + 1 = 20
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        assertEquals(Arrays.asList(2, 0), calc.addTwoNumbers(first, second));
    }

    @Test
    void sumarConAcarreoFinal() {
        // 99 + 1 = 100 (este es el caso que fallaba antes)
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));
        assertEquals(Arrays.asList(1, 0, 0), calc.addTwoNumbers(first, second));
    }

    @Test
    void sumarCero() {
        // 0 + 0 = 0
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(0));
        assertEquals(Arrays.asList(0), calc.addTwoNumbers(first, second));
    }

    @Test
    void sumarNumerosIguales() {
        // 5 + 5 = 10
        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5));
        assertEquals(Arrays.asList(1, 0), calc.addTwoNumbers(first, second));
    }
}