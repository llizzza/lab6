import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvokeProcessorTest {

    private InvokeTestClass invokeClass;

    @BeforeEach
    public void setup() {
        invokeClass = new InvokeTestClass();
    }

    @Test
    public void testInvokeMethods() {
        InvokeProcessor.process(invokeClass);

        assertTrue(invokeClass.flag);
        assertEquals(1, invokeClass.counter);
        assertNotEquals(10, invokeClass.counter);
    }

    @Test
    public void testNoExceptions() {
        assertDoesNotThrow(() -> InvokeProcessor.process(invokeClass));
    }
}

