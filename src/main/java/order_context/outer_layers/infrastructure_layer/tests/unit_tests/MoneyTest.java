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
        var money4 = new Money(55.097, "USD");
        assertEquals(55.1, money4.AMOUNT);
    }

    @Test
    void isLessThanTest() {
        var money = new Money(55.746890, "USD");
        assertEquals(false, money.isLessThan(new Money(55, "")));
        var money1 = new Money(55.74490, "USD");
        assertEquals(true, money1.isLessThan(new Money(55.77, "")));
        var money2 = new Money(55.0, "USD");
        assertEquals(false, money2.isLessThan(new Money(55.00, "")));
    }
    @Test
    void isEqualToTest() {
        var money = new Money(55.746890, "USD");
        assertEquals(false, money.isEqualTo(new Money(55, "")));
        var money1 = new Money(55.74490, "USD");
        assertEquals(false, money1.isEqualTo(new Money(55.77, "")));
        var money2 = new Money(55.0, "USD");
        assertEquals(true, money2.isEqualTo(new Money(55.00, "")));
        var money3 = new Money(55.001, "USD");
        assertEquals(true, money3.isEqualTo(new Money(55.00, "")));
        var money4 = new Money(55.097, "USD");
        assertEquals(true, money4.isEqualTo(new Money(55.1, "")));
    }
    @Test
    void isMoreThanTest() {
        var money = new Money(55.746890, "USD");
        assertEquals(true, money.isMoreThan(new Money(55, "")));
        var money1 = new Money(55.74490, "USD");
        assertEquals(false, money1.isMoreThan(new Money(55.77, "")));
        var money2 = new Money(55.0, "USD");
        assertEquals(false, money2.isMoreThan(new Money(55.00, "")));
    }
}
