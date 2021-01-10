package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.*;
import order_context.inner_layers.domain_layer.Address;
import order_context.inner_layers.domain_layer.Area;
import order_context.inner_layers.domain_layer.GeneralRequest;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralRequestTest {

    @Test
    void cancelTest() throws InvalidInputException {
        var gr0 = new GeneralRequest("", "", new Address("", new Name(""),
                new Location(324, 234), new Name(""), "", ""),
                new TimeInterval(new Time(), new Time()), new Description(""));
        assertEquals(GeneralRequestStatus.PENDING, gr0.getStatus());
        var gr1 = new GeneralRequest("", "", new Address("", new Name(""),
                new Location(324, 234), new Name(""), "", ""),
                new TimeInterval(new Time(), new Time()), new Description(""));
        gr1.cancel();
        assertEquals(GeneralRequestStatus.CANCELED, gr1.getStatus());
    }
}
