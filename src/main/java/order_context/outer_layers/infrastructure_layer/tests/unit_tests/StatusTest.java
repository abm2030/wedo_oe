package order_context.outer_layers.infrastructure_layer.tests.unit_tests;

import order_context.inner_layers.core_layer.GeneralRequestStatus;
import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.SpecificOfferStatus;
import order_context.inner_layers.core_layer.Status;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusTest {

    @Test
    void isSameAsTest() {
        GeneralRequestStatus s0 = GeneralRequestStatus.ACCEPTED;
        GeneralRequestStatus s1 = GeneralRequestStatus.ACCEPTED;
        assertEquals(true, s0.isSameAs(s1));
        SpecificOfferStatus s2 = SpecificOfferStatus.REJECTED;
        SpecificOfferStatus s3 = SpecificOfferStatus.CANCELED;
        assertEquals(false, s2.isSameAs(s3));
        Status s4 = new Status("HI");
        Status s5 = new Status("HI");
        assertEquals(true, s4.isSameAs(s5));
    }
    @Test
    void is() {
        GeneralRequestStatus s0 = GeneralRequestStatus.ACCEPTED;
        assertEquals(true, s0.isAccepted());
        SpecificOfferStatus s1 = SpecificOfferStatus.REJECTED;
        assertEquals(true, s1.isRejected());
        SpecificOfferStatus s2 = SpecificOfferStatus.CANCELED;
        assertEquals(false, s2.isAccepted());

    }
}
