package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.InvalidInputException;
import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.Name;
import order_context.inner_layers.domain_layer.Area;
import order_context.inner_layers.domain_layer.Place;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceTest {

    @Test
    void isSameAsTest() throws InvalidInputException {
        Place p0 = new Place(UUID.randomUUID().toString(), new Name("KFC"), new Location(461, 465132));
        Place p1 = new Place(UUID.randomUUID().toString(), new Name("KFC"), new Location(461, 465132));
        assertEquals(false, p0.isSameAs(p1));
        Place p2 = new Place("qwe", new Name("KFC"), new Location(461, 465132));
        Place p3 = new Place("qwe", new Name("KFC"), new Location(461, 465132));
        assertEquals(false, p1.isSameAs(p3));
    }
}
