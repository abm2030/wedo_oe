package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.InvalidInputException;
import order_context.inner_layers.core_layer.Memo;
import order_context.inner_layers.core_layer.Money;
import order_context.inner_layers.core_layer.SpecificOfferStatus;
import order_context.inner_layers.domain_layer.SpecificOffer;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificOfferTest {

    @Test
    void statusTest() throws InvalidInputException {
        var so0 = new SpecificOffer("qwe", "qwe", new Money(0, "SAR"), new Memo(""));
        so0.accept();
        assertEquals(SpecificOfferStatus.ACCEPTED, so0.getStatus());
        var so1 = new SpecificOffer("qwe", "qwe", new Money(0, "SAR"), new Memo(""));
        so1.cancel();
        assertEquals(SpecificOfferStatus.CANCELED, so1.getStatus());
        var so2 = new SpecificOffer("qwe", "qwe", new Money(0, "SAR"), new Memo(""));
        so2.reject();
        assertEquals(SpecificOfferStatus.REJECTED, so2.getStatus());
        var so3 = new SpecificOffer("qwe", "qwe", new Money(0, "SAR"), new Memo(""));
        assertEquals(SpecificOfferStatus.PENDING, so3.getStatus());
    }
}
