package order_context.inner_layers.domain_layer;

import order_context.inner_layers.core_layer.Description;
import order_context.inner_layers.core_layer.GeneralRequestStatus;
import order_context.inner_layers.core_layer.Time;
import order_context.inner_layers.core_layer.TimeInterval;

public class GeneralRequest {
    private String generalRequestID;
    private String customerID;
    private Time createdAt;
    private Address deliverTo;
    private TimeInterval deliverAt;
    private Description description;
    private GeneralRequestStatus status;


    public GeneralRequest(String generalRequestID, String customerID, Address deliverTo, TimeInterval deliverAt, Description description) {
        this.generalRequestID = generalRequestID;
        this.customerID = customerID;
        this.createdAt = new Time();
        this.deliverTo = deliverTo;
        this.deliverAt = deliverAt;
        this.description = description;
        this.status = GeneralRequestStatus.PENDING;
    }

    public void cancel() {
        this.status = GeneralRequestStatus.CANCELED;
    }


    public GeneralRequestStatus getStatus() {
        return status;
    }
}
