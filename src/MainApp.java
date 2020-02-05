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

//Creating an instance of the ShoppingCart in order to access its components:
        ShoppingCart myShoppingCart = new ShoppingCart();


//Creating instances of the Product POJO class:
        Product soap = new Product("Soap", 3.0);
        Product cereals = new Product("Cereals", 2.5);
        Product chineseVeg = new Product("Chinese vegetables", 5.0);
        Product yoghourt = new Product("Yoghourt", 2.0);
        Product diapers = new Product("Diapers", 10.0);

//Adding the new Product instances to myShoppingCart by calling the addProduct function in the ShoppingCart class:
        myShoppingCart.addProduct(soap);
        myShoppingCart.addProduct(cereals);
        myShoppingCart.addProduct(chineseVeg);
        myShoppingCart.addProduct(yoghourt);
        myShoppingCart.addProduct(diapers);

//Calling the functions of the ShoppingCart class:
        myShoppingCart.getShoppingCartItems();
        myShoppingCart.calculateDiscount();
        myShoppingCart.getTotalCost();
        myShoppingCart.calcChange(30);

    }
}
