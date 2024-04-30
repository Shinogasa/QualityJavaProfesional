package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        assertEquals(4, new Calc().add(2, 2), "2 + 2 = 4");
        assertEquals(6, new Calc().add(2, 4), "2 + 4 = 6");
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("¥10,000"));
        assertDoesNotThrow(() -> new Calc().add(-100, 10), "負の値を渡しても例外は出ない");

    }
}