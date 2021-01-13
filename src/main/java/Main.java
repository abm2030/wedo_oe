import order_context.inner_layers.core_layer.InvalidInputException;
import order_context.outer_layers.infrastructure_layer.storage.InMemoryDB;

public class Main {
    public static void main(String[] args) throws InvalidInputException {
        System.out.println("hi");
        var db = new InMemoryDB();
        System.out.println(db.fetchAll(null, null, null, null,
                null, null, null).size());
    }
}