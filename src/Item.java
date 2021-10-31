import java.util.ListIterator;

public class Item {

    private String productname;
    private int price;
    private String quanity;

    public Item(String upc,int cost,String quant){
        this.productname=upc;
        this.quanity=quant;
        this.price=cost;
    }

    public String getProductName() {
        return productname;
    }
    public String getQuanity() {
        return quanity;
    }
    public int getPrice() {
        return price;
    }

}