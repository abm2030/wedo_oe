package order_context.inner_layers.core_layer;

public class Money {
    public final double AMOUNT;
    public final int ALLOWED_FRACTION_SIZE = 2;
    public final String CURRENCY;

    public Money(double amount, String currency) {
        AMOUNT = this.roundToAllowedFractionSize(amount);
        CURRENCY = currency;
    }

    private double roundToAllowedFractionSize(double amount) {
        return Math.round(amount*Math.pow(10, this.ALLOWED_FRACTION_SIZE))/Math.pow(10, this.ALLOWED_FRACTION_SIZE);
    }

    public boolean isLessThan(Money anotherMoney) {
        return this.AMOUNT < anotherMoney.AMOUNT;
    }
    public boolean isEqualTo(Money anotherMoney) {
        return this.AMOUNT == anotherMoney.AMOUNT;
    }
    public boolean isMoreThan(Money anotherMoney) {
        return this.AMOUNT > anotherMoney.AMOUNT;
    }
}
