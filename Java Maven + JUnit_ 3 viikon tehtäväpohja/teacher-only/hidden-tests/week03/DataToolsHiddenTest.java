package fi.savonia.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DataToolsHiddenTest { @Test void edgeCases() { assertEquals(0, DataTools.sum(new int[]{})); assertEquals(-2, DataTools.sum(new int[]{-5,3})); assertEquals(0, DataTools.countChar("abc",'x')); assertEquals("", DataTools.reverse("")); } }
