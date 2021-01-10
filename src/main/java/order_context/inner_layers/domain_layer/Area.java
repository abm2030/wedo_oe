package order_context.inner_layers.domain_layer;

import order_context.inner_layers.core_layer.Location;
import order_context.inner_layers.core_layer.Name;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String areaID;
    private Name name;
    private List<Location> borders;


    public Area(String areaID, Name name) {
        this.areaID = areaID;
        this.name = name;
        this.borders = new ArrayList<Location>();
    }

    public boolean isSameAs(Area another) {
        return this.areaID == another.areaID;
    }
}
