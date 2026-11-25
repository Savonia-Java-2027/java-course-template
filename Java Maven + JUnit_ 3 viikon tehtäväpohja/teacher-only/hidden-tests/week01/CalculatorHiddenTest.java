package fi.savonia.exercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorHiddenTest { @Test void edgeCases() { assertEquals(-9, Calculator.add(-4,-5)); assertEquals(15, Calculator.subtract(10,-5)); assertEquals(0, Calculator.multiply(200,0)); } }
