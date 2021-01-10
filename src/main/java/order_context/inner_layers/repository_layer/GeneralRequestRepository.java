package order_context.inner_layers.repository_layer;

import order_context.inner_layers.domain_layer.GeneralRequest;

import java.util.List;

public interface GeneralRequestRepository {
    public void save(GeneralRequest generalRequest);
    public GeneralRequest fetchByID(String generalRequestID);
    public List<GeneralRequest> fetchAll(
            List<String> filterByIDs,
            List<String> filterByCustomers,
            List<String> filterByCreatedTimes,
            List<String> filterByAreas,
            List<String> filterByPlaces,
            List<String> filterByDeliveryTimes,
            List<String> filterByStatuses
    );
    public void update(GeneralRequest newOne);
    public void delete(String generalRequestID);
}
