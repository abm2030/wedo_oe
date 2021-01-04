package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.Time;
import order_context.inner_layers.core_layer.TimeInterval;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeIntervalTest {

    @Test
    void isSameAsTest() {
        var timeInterval0 = new TimeInterval(new Time(2021,01,04,03,03,00),
                                                new Time(2021,01,04,03,03,05));
        assertEquals(true, timeInterval0.isSameAs(
                new TimeInterval(new Time(2021,01,04,03,03,00),
                        new Time(2021,01,04,03,03,05))
        ));
        var timeInterval1 = new TimeInterval(new Time(2021,01,04,03,03,00),
                new Time(2021,01,04,03,03,05));
        assertEquals(false, timeInterval1.isSameAs(
                new TimeInterval(new Time(2021,01,04,03,03,00),
                        new Time(2021,01,04,03,03,04))
        ));
        var timeInterval2 = new TimeInterval(new Time(2021,01,04,03,03,00),
                new Time(2021,01,04,03,03,05));
        assertEquals(false, timeInterval2.isSameAs(
                new TimeInterval(new Time(2021,01,04,03,03,00),
                        new Time(2021,01,04,03,03,06))
        ));

    }
}
