package fi.savonia.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class NumberToolsTest {
    @Test void even() { assertTrue(NumberTools.isEven(8)); assertFalse(NumberTools.isEven(7)); }
    @Test void sum() { assertEquals(15, NumberTools.sumTo(5)); }
    @Test void maximum() { assertEquals(9, NumberTools.maxOfThree(3, 9, 4)); }
}
