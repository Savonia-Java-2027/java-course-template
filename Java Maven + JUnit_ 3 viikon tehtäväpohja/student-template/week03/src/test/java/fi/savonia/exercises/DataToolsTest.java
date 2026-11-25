package fi.savonia.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class DataToolsTest {
    @Test void sums() { assertEquals(10, DataTools.sum(new int[]{2, 3, 5})); }
    @Test void counts() { assertEquals(3, DataTools.countChar("banana", 'a')); }
    @Test void reverses() { assertEquals("avaJ", DataTools.reverse("Java")); }
}
