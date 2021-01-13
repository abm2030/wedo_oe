package order_context.outer_layers.infrastructure_layer.storage;

import order_context.inner_layers.core_layer.*;
import order_context.inner_layers.domain_layer.Address;
import order_context.inner_layers.domain_layer.Area;
import order_context.inner_layers.domain_layer.GeneralRequest;
import order_context.inner_layers.domain_layer.Place;
import order_context.inner_layers.repository_layer.GeneralRequestRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB implements GeneralRequestRepository {
    private List<GeneralRequest> generalRequests = new ArrayList<GeneralRequest>();

    public InMemoryDB() throws InvalidInputException {
        var gr0 = new GeneralRequest("q", "", new Place("", new Name(""),
                new Location(234, 134)), new Address("", new Name(""),
                new Location(234, 234), new Name(""), "", ""),
                new TimeInterval(new Time(), new Time()), new Description(""));
        var gr1 = new GeneralRequest("w", "", new Place("", new Name(""),
                new Location(234, 134)), new Address("", new Name(""),
                new Location(234, 234), new Name(""), "", ""),
                new TimeInterval(new Time(), new Time()), new Description(""));
        var gr2 = new GeneralRequest("e", "", new Place("", new Name(""),
                new Location(234, 134)), new Address("", new Name(""),
                new Location(234, 234), new Name(""), "", ""),
                new TimeInterval(new Time(), new Time()), new Description(""));

        this.generalRequests.add(gr0);
        this.generalRequests.add(gr1);
        this.generalRequests.add(gr2);
    }

    @Override
    public void save(GeneralRequest generalRequest) {
        this.generalRequests.add(generalRequest);
    }

    @Override
    public GeneralRequest fetchByID(String generalRequestID) {
        for (GeneralRequest gr : this.generalRequests)
            if (gr.getGeneralRequestID() == generalRequestID)
                return gr;
        return null;
    }

    @Override
    public List<GeneralRequest> fetchAll(List<String> filterByIDs, List<String> filterByCustomers,
                                         List<TimeInterval> filterByCreatedTimes, List<String> filterByAreas,
                                         List<String> filterByPlaces, List<TimeInterval> filterByDeliveryTimes,
                                         List<GeneralRequestStatus> filterByStatuses) {
        if (filterByAreas == null || filterByPlaces == null || filterByCustomers == null ||
                filterByCreatedTimes == null || filterByIDs == null || filterByDeliveryTimes == null ||
                filterByStatuses == null) return this.generalRequests;
        List<GeneralRequest> result = new ArrayList<GeneralRequest>();

        for (String id : filterByIDs)
            for (GeneralRequest gr : this.generalRequests)
                if (gr.getGeneralRequestID() == id) result.add(gr);
        for (String id : filterByAreas)
            for (GeneralRequest gr : this.generalRequests)
                for (Area a : gr.getDeliverFrom().getAreas())
                    if (a.getAreaID() == id) {
                        result.add(gr);
                        break;
                    };
        for (String id : filterByPlaces)
            for (GeneralRequest gr : this.generalRequests)
                if (gr.getDeliverFrom().getPlaceID() == id) result.add(gr);
        for (String id : filterByCustomers)
            for (GeneralRequest gr : this.generalRequests)
                if (gr.getCustomerID() == id) result.add(gr);
        for (TimeInterval ti : filterByCreatedTimes)
            for (GeneralRequest gr : this.generalRequests)
                if (ti.isWithin(gr.getCreatedAt())) result.add(gr);
        for (TimeInterval ti : filterByDeliveryTimes)
            for (GeneralRequest gr : this.generalRequests)
                if (ti.isWithin(gr.getDeliverAt())) result.add(gr);
        for (GeneralRequestStatus grs : filterByStatuses)
            for (GeneralRequest gr : this.generalRequests)
                if (gr.getStatus().isSameAs(grs)) result.add(gr);

        return result;
    }

    @Override
    public void update(GeneralRequest newOne) {
        this.delete(newOne.getGeneralRequestID());
        this.save(newOne);
    }

    @Override
    public void delete(String generalRequestID) {
        for (GeneralRequest gr : this.generalRequests)
            if (gr.getGeneralRequestID() == generalRequestID)
                this.generalRequests.remove(gr);
    }
}
