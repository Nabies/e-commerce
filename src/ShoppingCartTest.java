public class ShoppingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("HP laptops",50000,"3");
        Item item2 = new Item("ACER laptop",70000,"2");
        Item item3 = new Item("USB",750,"100");
        Item item4 = new Item("Adapator", 1000,"100");
        Item item5 = new Item("pendrive", 2000,"1000");

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.removeItem(item2);

        //pay by credit card
        cart.pay(new CreditCardStrategy("Nawinkrishna", "1234567890123456", "786", "12/15"));
    }

}