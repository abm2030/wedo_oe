package order_context.inner_layers.core_layer;

public class TextContent {
    public final int MAX_CHARACTER;
    public final String CONTENT;

    public TextContent(int max_character, String content) throws InvalidInputException {
        MAX_CHARACTER = max_character;
        CONTENT = content;
        this.checkContentExceededMax();
    }

    private void checkContentExceededMax() throws InvalidInputException {
        if (this.CONTENT.length() > this.MAX_CHARACTER)
            throw new InvalidInputException(0000, "the character length exceeded the allowed length which is "+this.MAX_CHARACTER);
    }
}
