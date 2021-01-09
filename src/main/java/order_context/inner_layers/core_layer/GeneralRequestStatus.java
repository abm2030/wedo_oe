package order_context.inner_layers.core_layer;

public class GeneralRequestStatus extends Status{
    public static final GeneralRequestStatus ACCEPTED = new GeneralRequestStatus("ACCEPTED");
    public static final GeneralRequestStatus PENDING = new GeneralRequestStatus("PENDING");
    public static final GeneralRequestStatus CANCELED = new GeneralRequestStatus("CANCELED");

    private GeneralRequestStatus(String name) {
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
}
