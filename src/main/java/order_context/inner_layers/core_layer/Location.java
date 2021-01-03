package order_context.inner_layers.core_layer;

public class Location {
    public final double LAITUDE;
    public final double LONGTITUDE;

    public Location(double laitude, double longtitude) {
        LAITUDE = laitude;
        LONGTITUDE = longtitude;
    }

    public boolean isSameAs(Location anotherLocation) {
        return this.LAITUDE == anotherLocation.LAITUDE && this.LONGTITUDE == anotherLocation.LONGTITUDE;
    }
}
