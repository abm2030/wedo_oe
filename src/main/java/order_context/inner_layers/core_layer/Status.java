package order_context.inner_layers.core_layer;

public class Status {
    public final String Name;

    public Status(String name) {
        Name = name;
    }

    public boolean isSameAs(Status another) {
        return this.Name == another.Name;
    }
}
