package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.InvalidInputException;
import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.Name;
import order_context.inner_layers.domain_layer.Area;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {

    @Test
    void isSameAsTest() throws InvalidInputException {
        Area a0 = new Area(UUID.randomUUID().toString(), new Name("Dohah"));
        Area a1 = new Area(UUID.randomUUID().toString(), new Name("Dohah"));
        assertEquals(false, a0.isSameAs(a1));
        Area a2 = new Area("qwe", new Name("Dohah"));
        Area a3 = new Area("qwe", new Name("Dohah"));
        assertEquals(false, a1.isSameAs(a3));
    }
}
