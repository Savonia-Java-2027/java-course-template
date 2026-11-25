package fi.savonia.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class NumberToolsHiddenTest { @Test void edgeCases() { assertTrue(NumberTools.isEven(-6)); assertFalse(NumberTools.isEven(-3)); assertEquals(0, NumberTools.sumTo(0)); assertEquals(1, NumberTools.sumTo(1)); assertEquals(-1, NumberTools.maxOfThree(-7,-1,-3)); } }
