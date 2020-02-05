public class MainApp {

    public static void main(String[] args) {
        System.out.println("Welcome to AH supermarket!\n" +
                "\nYou have the following items in your shopping cart: \n");

        ShoppingCart myShoppingCart = new ShoppingCart();

        myShoppingCart.addProduct("Soap", 3.0);
        myShoppingCart.addProduct("Cereals", 2.5);
        myShoppingCart.addProduct("Chinese vegetables", 5.0);
        myShoppingCart.addProduct("Yoghourt", 2.0);
        myShoppingCart.addProduct("Diapers", 10.0);

        myShoppingCart.getShoppingCartItems();
        myShoppingCart.calculateDiscount();
        myShoppingCart.getTotalCost();
        myShoppingCart.calcChange(30);

    }
}
