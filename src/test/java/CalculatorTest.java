import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void dif() {
        assertEquals(3, calculator.dif(8, 5));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(20, 5));
    }

    @Test
    void times() {
        assertEquals(24, calculator.times(6, 4));
    }

    @Test
    void solver() {
        assertEquals(5, calculator.solver());
    }
}