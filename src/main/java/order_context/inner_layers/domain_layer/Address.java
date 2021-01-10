package order_context.inner_layers.domain_layer;

import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.Name;

import java.util.List;

public class Address {
    private String addressID;
    private Name name;
    private Location location;
    private Name street;
    private String buildingNo;
    private String apartmentNo;
    private List<Area> areas;


    public Address(String addressID, Name name, Location location, Name street, String buildingNo, String apartmentNo) {
        this.addressID = addressID;
        this.name = name;
        this.location = location;
        this.street = street;
        this.buildingNo = buildingNo;
        this.apartmentNo = apartmentNo;
    }
}
