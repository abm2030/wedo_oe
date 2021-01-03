package order_context.inner_layers.core_layer;

import java.time.LocalDateTime;

public class Time {
    public final int YEAR;
    public final int MONTH;
    public final int DAY;
    public final int HOUR;
    public final int MINUTE;
    public final int SECOND;

    public Time(int year, int month, int day, int hour, int minute, int second) {
        YEAR = year;
        MONTH = month;
        DAY = day;
        HOUR = hour;
        MINUTE = minute;
        SECOND = second;
    }
    public Time() {
        this(LocalDateTime.now().getYear(), LocalDateTime.now().getMonthValue(), LocalDateTime.now().getDayOfMonth(),
                LocalDateTime.now().getHour(), LocalDateTime.now().getMinute(), LocalDateTime.now().getSecond());

    }

    public boolean isOlderThan(Time another) {
        if (this.YEAR < another.YEAR) return true;
        else if (this.YEAR > another.YEAR) return false;
        if (this.MONTH < another.MONTH) return true;
        else if (this.MONTH > another.MONTH) return false;
        if (this.DAY < another.DAY) return true;
        else if (this.DAY > another.DAY) return false;
        if (this.HOUR < another.HOUR) return true;
        else if (this.HOUR > another.HOUR) return false;
        if (this.MINUTE < another.MINUTE) return true;
        else if (this.MINUTE > another.MINUTE) return false;
        if (this.SECOND < another.SECOND) return true;
        else if (this.SECOND > another.SECOND) return false;

        return false; // it shouldn't reach here but if it did high probability to be false than true
    }
    public boolean isSameAs(Time another) {
        return this.YEAR == another.YEAR &&
                this.MONTH == another.MONTH &&
                this.DAY == another.DAY &&
                this.HOUR == another.HOUR &&
                this.MINUTE == another.MINUTE &&
                this.SECOND == another.SECOND;
    }
    public boolean isNewerThan(Time another) {
        if (this.YEAR < another.YEAR) return false;
        else if (this.YEAR > another.YEAR) return true;
        if (this.MONTH < another.MONTH) return false;
        else if (this.MONTH > another.MONTH) return true;
        if (this.DAY < another.DAY) return false;
        else if (this.DAY > another.DAY) return true;
        if (this.HOUR < another.HOUR) return false;
        else if (this.HOUR > another.HOUR) return true;
        if (this.MINUTE < another.MINUTE) return false;
        else if (this.MINUTE > another.MINUTE) return true;
        if (this.SECOND < another.SECOND) return false;
        else if (this.SECOND > another.SECOND) return true;

        return false; // it shouldn't reach here but if it did high probability to be false than true
    }
}
