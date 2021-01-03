package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.Money;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    void roundToAllowedFractionSizeTest() {
        var money = new Money(55.746890, "USD");
        assertEquals(55.75, money.AMOUNT);
        var money1 = new Money(55.74490, "USD");
        assertEquals(55.74, money1.AMOUNT);
        var money2 = new Money(55.0, "USD");
        assertEquals(55, money2.AMOUNT);
        var money3 = new Money(55.9, "USD");
        assertEquals(55.9, money3.AMOUNT);
        var money4 = new Money(55.3333, "USD");
        assertEquals(55.33, money4.AMOUNT);
    }
}
