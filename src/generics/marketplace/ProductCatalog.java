package generics.marketplace;
import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private List<Product<?>> catalog = new ArrayList<>();

    public void addProduct(Product<?> product) {
        catalog.add(product);
    }

    public void displayCatalog() {
        for (Product<?> product : catalog) {
            System.out.println(product);
        }
    }
}
