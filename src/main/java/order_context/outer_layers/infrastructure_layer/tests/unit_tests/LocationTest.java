package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.Money;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    @Test
    void isSameAsTest() {
        var location0 = new Location(23.45433245, 12.345);
        assertEquals(false, location0.isSameAs(new Location(11.323, 45.121323123)));
        var location1 = new Location(23.45433245, 12.345);
        assertEquals(true, location1.isSameAs(new Location(23.45433245, 12.345)));
    }
}
