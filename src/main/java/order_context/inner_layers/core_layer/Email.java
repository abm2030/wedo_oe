package order_context.inner_layers.core_layer;

public class Email extends TextContent {

    public Email(String content) throws InvalidInputException {
        super(70, content);

    }
}
