package order_context.inner_layers.core_layer;

public class SpecificOfferStatus extends Status{
    public static final SpecificOfferStatus ACCEPTED = new SpecificOfferStatus("ACCEPTED");
    public static final SpecificOfferStatus REJECTED = new SpecificOfferStatus("REJECTED");
    public static final SpecificOfferStatus PENDING = new SpecificOfferStatus("PENDING");
    public static final SpecificOfferStatus CANCELED = new SpecificOfferStatus("CANCELED");

    private SpecificOfferStatus(String name) {
        super(name);
    }

    public boolean isAccepted() {
        return this == ACCEPTED;
    }
    public boolean isPending() {
        return this == PENDING;
    }
    public boolean isCanceled() {
        return this == CANCELED;
    }
    public boolean isRejected() {
        return this == REJECTED;
    }
}
