package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    private final Mirror mirror = new Mirror();

    @Test
    void cadenaNormal() {
        // "abXYZba" => "ab"
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    void cadenaConUnCaracter() {
        // "abca" => "a"
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    void cadenaCompleta() {
        // "aba" => "aba" (toda la cadena es espejo)
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    void cadenaVacia() {
        // "" => ""
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    void cadenaUnSoloCaracter() {
        // "a" => "a"
        assertEquals("a", mirror.mirrorEnds("a"));
    }

    @Test
    void cadenaPar() {
        // "abba" => "abba" (longitud par)
        assertEquals("abba", mirror.mirrorEnds("abba"));
    }

    @Test
    void cadenaImpar() {
        // "abcba" => "abcba" (longitud impar)
        assertEquals("abcba", mirror.mirrorEnds("abcba"));
    }

    @Test
    void sinEspejo() {
        // "abcd" => "" (sin espejo)
        assertEquals("", mirror.mirrorEnds("abcd"));
    }
}