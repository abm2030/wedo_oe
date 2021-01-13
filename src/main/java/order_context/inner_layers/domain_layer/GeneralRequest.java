package order_context.inner_layers.domain_layer;

import order_context.inner_layers.core_layer.Description;
import order_context.inner_layers.core_layer.GeneralRequestStatus;
import order_context.inner_layers.core_layer.Time;
import order_context.inner_layers.core_layer.TimeInterval;

public class GeneralRequest {
    private String generalRequestID;
    private String customerID;
    private Time createdAt;
    private Place deliverFrom;
    private Address deliverTo;
    private TimeInterval deliverAt;
    private Description description;
    private GeneralRequestStatus status;


    public GeneralRequest(String generalRequestID, String customerID, Place deliverFrom, Address deliverTo, TimeInterval deliverAt, Description description) {
        this.generalRequestID = generalRequestID;
        this.customerID = customerID;
        this.createdAt = new Time();
        this.deliverFrom = deliverFrom;
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

    public String getGeneralRequestID() {
        return generalRequestID;
    }

    public Place getDeliverFrom() {
        return deliverFrom;
    }

    public String getCustomerID() {
        return customerID;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public TimeInterval getDeliverAt() {
        return deliverAt;
    }
}
