import java.util.ArrayList;
import java.util.List;
public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
        String [] productNames = {"laptop", "pendrive", "usb","apples"};
        Double [] productPrice = {40000.00d, 6000.00d, 300.00d,100.00d};
        Integer [] stock = {1, 600, 100,4};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}