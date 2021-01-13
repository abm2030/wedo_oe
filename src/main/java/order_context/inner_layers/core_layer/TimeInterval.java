package order_context.inner_layers.core_layer;

public class TimeInterval {
    public final Time BEGIN;
    public final Time END;

    public TimeInterval(Time begin, Time end) {
        BEGIN = begin;
        END = end;
    }

    public boolean isSameAs(TimeInterval another) {
        if (this.BEGIN.isEqualTo(another.BEGIN) && this.END.isEqualTo(another.END))
                return true;
        return false;
    }

    public boolean isWithin(TimeInterval another) {
        if (this.BEGIN.isLessThan(another.BEGIN) || this.END.isMoreThan(another.END)) return false;
        return true;
    }
    public boolean isWithin(Time time) {
        if (time.isLessThan(this.BEGIN) | time.isMoreThan(this.END)) return false;
        return true;
    }
}
