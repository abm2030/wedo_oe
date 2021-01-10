package order_context.inner_layers.domain_layer;

import order_context.inner_layers.core_layer.Memo;
import order_context.inner_layers.core_layer.Money;
import order_context.inner_layers.core_layer.SpecificOfferStatus;
import order_context.inner_layers.core_layer.Time;

public class SpecificOffer {
    private String specificOfferID;
    private String driverID;
    private Time createdAt;
    private Money deliveryPrice;
    private Memo memo;
    private SpecificOfferStatus status;

    public SpecificOffer(String specificOfferID, String driverID, Money deliveryPrice, Memo memo) {
        this.specificOfferID = specificOfferID;
        this.driverID = driverID;
        this.createdAt = new Time();
        this.deliveryPrice = deliveryPrice;
        this.memo = memo;
        this.status = SpecificOfferStatus.PENDING;
    }

    public void accept() {
        this.status = SpecificOfferStatus.ACCEPTED;
    }
    public void cancel() {
        this.status = SpecificOfferStatus.CANCELED;
    }
    public void reject() {
        this.status = SpecificOfferStatus.REJECTED;
    }

    public SpecificOfferStatus getStatus() {
        return status;
    }
}
