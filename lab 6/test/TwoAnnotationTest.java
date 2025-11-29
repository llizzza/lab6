import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TwoAnnotationTest {

    @Test
    void testInvalidAnnotationValues() {

        assertThrows(IllegalArgumentException.class, () -> {
            TwoValidator.validate(InvalidTwoClass.class);
        });

    }
}
