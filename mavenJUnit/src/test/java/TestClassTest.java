import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    @Test
    void testFunction() {
        assertEquals(25, TestClass.testFunction(5, 5));
    }

    @Test
    void testFunctionAnother() {
        assertEquals(32, TestClass.testFunction(8, 4));
    }

    @Test
    void testFunctionFailed() {
        assertEquals(32, TestClass.testFunction(28, 4));
    }

    @Test
    void testFunctionThrowsException() {
        assertThrows(MyException.class, () -> {
            TestClass.testFunction(-5, 2);
        });
    }
}