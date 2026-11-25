package fi.savonia.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    @Test void adds() { assertEquals(9, Calculator.add(4, 5)); }
    @Test void subtracts() { assertEquals(4, Calculator.subtract(10, 6)); }
    @Test void multiplies() { assertEquals(21, Calculator.multiply(3, 7)); }
}
