package order_context.inner_layers.domain_layer;

import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.Name;

import java.util.List;

public class Place {
    private String placeID;
    private Name name;
    private Location location;
    private List<Area> areas;

    public Place(String placeID, Name name, Location location) {
        this.placeID = placeID;
        this.name = name;
        this.location = location;
    }

    public boolean isSameAs(Place another) {
        return this.placeID == another.placeID;
    }

    public String getPlaceID() {
        return placeID;
    }

    public List<Area> getAreas() {
        return areas;
    }
}
