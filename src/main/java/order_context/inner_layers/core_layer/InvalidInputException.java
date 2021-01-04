package order_context.inner_layers.core_layer;

public class InvalidInputException extends Exception {
    public final int CODE;
    public final String MESSAGE;

    public InvalidInputException(int code, String message) {
        CODE = code;
        MESSAGE = message;
    }

    @Override
    public String toString() {
        return "InvalidInputException{" +
                "CODE=" + CODE +
                ", MESSAGE='" + MESSAGE + '\'' +
                '}';
    }
}
