package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.Email;
import order_context.inner_layers.core_layer.InvalidInputException;
import order_context.inner_layers.core_layer.Location;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextContentTest {

    @Test
    void checkContentExceededMaxTest() {
        try {
            var textContent0 = new Email("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
                    "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            assertEquals(textContent0.CONTENT.length() <= textContent0.MAX_CHARACTER, true);
        } catch (InvalidInputException e) {

        }
    }
}
