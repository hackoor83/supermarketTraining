public class MainApp {

    public static void main(String[] args) {
        System.out.println("\n" +
                "   _____                    _____                                            _        _   \n" +
                "  / ____|                  / ____|                                          | |      | |  \n" +
                " | (___   __ _ _ __ ___   | (___  _   _ _ __   ___ _ __ _ __ ___   __ _ _ __| | _____| |_ \n" +
                "  \\___ \\ / _` | '_ ` _ \\   \\___ \\| | | | '_ \\ / _ \\ '__| '_ ` _ \\ / _` | '__| |/ / _ \\ __|\n" +
                "  ____) | (_| | | | | | |  ____) | |_| | |_) |  __/ |  | | | | | | (_| | |  |   <  __/ |_ \n" +
                " |_____/ \\__,_|_| |_| |_| |_____/ \\__,_| .__/ \\___|_|  |_| |_| |_|\\__,_|_|  |_|\\_\\___|\\__|\n" +
                "                                       | |                                                \n" +
                "                                       |_|                                                \n" +
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
