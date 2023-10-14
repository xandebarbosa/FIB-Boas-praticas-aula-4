import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CartaConverterTest {

    @Test
    void testConverteAs() {
        CartaConverter converter = new CartaConverter();
        assertEquals(1, converter.converteCartaParaInt("A"));
        assertEquals(1, converter.converteCartaParaInt("a"));
    }

    @Test
    void testConverteNumeros() {
        CartaConverter converter = new CartaConverter();
        assertEquals(2, converter.converteCartaParaInt("2"));
        assertEquals(10, converter.converteCartaParaInt("10"));
        assertEquals(11, converter.converteCartaParaInt("J"));
        assertEquals(11, converter.converteCartaParaInt("j"));
        assertEquals(12, converter.converteCartaParaInt("Q"));
        assertEquals(12, converter.converteCartaParaInt("q"));
        assertEquals(13, converter.converteCartaParaInt("K"));
        assertEquals(13, converter.converteCartaParaInt("k"));
    }

    @Test
    void testConverteDe3a9() {
        CartaConverter converter = new CartaConverter();
        for (int i = 3; i <= 9; i++) {
            assertEquals(i, converter.converteCartaParaInt(String.valueOf(i)));
        }
    }

    @Test
    void testConverteInvalida() {
        CartaConverter converter = new CartaConverter();
        assertEquals(-1, converter.converteCartaParaInt("z"));
    }
}
