package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.Time;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {

    @Test
    void isLessThanTest() {
        var time0 = new Time(2021,01,04,02,10,00);
        assertEquals(true, time0.isLessThan(new Time()));
        var time1 = new Time(2021,01,04,02,10,00);
        assertEquals(false, time1.isLessThan(new Time(2021,01,04,02,10,00)));
        var time2 = new Time(2021,01,04,02,10,00);
        assertEquals(false, time2.isLessThan(new Time(2020,01,04,02,10,00)));
    }
    @Test
    void isEqualToTest() {
        var time0 = new Time(2021,01,04,02,10,00);
        assertEquals(false, time0.isEqualTo(new Time()));
        var time1 = new Time(2021,01,04,02,10,00);
        assertEquals(true, time1.isEqualTo(new Time(2021,01,04,02,10,00)));
        var time2 = new Time(2021,01,04,02,10,00);
        assertEquals(false, time2.isEqualTo(new Time(2020,01,04,02,10,00)));
    }
    @Test
    void isMoreThanTest() {
        var time0 = new Time(2021,01,04,02,10,00);
        assertEquals(false, time0.isMoreThan(new Time()));
        var time1 = new Time(2021,01,04,02,10,00);
        assertEquals(false, time1.isMoreThan(new Time(2021,01,04,02,10,00)));
        var time2 = new Time(2021,01,04,02,10,00);
        assertEquals(true, time2.isMoreThan(new Time(2020,01,04,02,10,00)));
    }
}
