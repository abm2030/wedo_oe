package order_context.inner_layers.core_layer;

public class TimeInterval {
    public final Time BEGIN;
    public final Time END;

    public TimeInterval(Time begin, Time end) {
        BEGIN = begin;
        END = end;
    }

    public boolean isSameAs(TimeInterval another) {
        if (this.BEGIN.isSameAs(another.BEGIN) && this.END.isSameAs(another.END))
                return true;
        return false;
    }
}
