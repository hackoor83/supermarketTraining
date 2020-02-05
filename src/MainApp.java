import java.util.Scanner;

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
                "\nWe have the following items: \n");

//Creating an instance of the ShoppingCart in order to access its components:
        ShoppingCart myShoppingCart = new ShoppingCart();

//Showing the user a list of available products:
        System.out.println(
                "1.     Soap:               3.0 EUR\n" +
                        "2.     Cereals:            2.5 EUR\n" +
                        "3.     Chinese Vegetables: 5.0 EUR\n" +
                        "4.     Yoghourt:           2.0 EUR\n" +
                        "5.     Diapers:            10.0 EUR\n" +
                        "6.     Checkout");

//Creating a scanner to collect information from the user:

        boolean reshowMenu = true;

        do {
            System.out.println("\nType the number of the item to add it to your shopping cart: \n");
            Scanner scanner = new Scanner(System.in);
            int itemNumber = scanner.nextInt();

            switch (itemNumber) {
                case 1:
                    Product soap = new Product("Soap", 3.0);
                    myShoppingCart.addProduct(soap);
                    break;
                case 2:
                    Product cereals = new Product("Cereals", 2.5);
                    myShoppingCart.addProduct(cereals);
                    break;
                case 3:
                    Product chineseVeg = new Product("Chinese vegetables", 5.0);
                    myShoppingCart.addProduct(chineseVeg);
                    break;
                case 4:
                    Product yoghourt = new Product("Yoghourt", 2.0);
                    myShoppingCart.addProduct(yoghourt);
                    break;
                case 5:
                    Product diapers = new Product("Diapers", 10.0);
                    myShoppingCart.addProduct(diapers);
                    break;
                default:
                    reshowMenu = false;
                    System.out.println("\nChecking out!\n");
                    myShoppingCart.getShoppingCartItems();
                    myShoppingCart.calculateDiscount();
                    myShoppingCart.getTotalCost();
                    myShoppingCart.calcChange(30);
                    break;
            }
        } while (reshowMenu);

    }

//Creating instances of the Product POJO class:
//        Product soap = new Product("Soap", 3.0);
//        Product cereals = new Product("Cereals", 2.5);
//        Product chineseVeg = new Product("Chinese vegetables", 5.0);
//        Product yoghourt = new Product("Yoghourt", 2.0);
//        Product diapers = new Product("Diapers", 10.0);

//Adding the new Product instances to myShoppingCart by calling the addProduct function in the ShoppingCart class:
//        myShoppingCart.addProduct(soap);
//        myShoppingCart.addProduct(cereals);
//        myShoppingCart.addProduct(chineseVeg);
//        myShoppingCart.addProduct(yoghourt);
//        myShoppingCart.addProduct(diapers);

//Calling the functions of the ShoppingCart class:
//        myShoppingCart.getShoppingCartItems();
//        myShoppingCart.calculateDiscount();
//        myShoppingCart.getTotalCost();
//        myShoppingCart.calcChange(30);

}

