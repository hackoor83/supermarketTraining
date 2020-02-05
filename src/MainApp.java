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
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nType the number of the item to add it to your shopping cart: \n");
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
                    break;
            }
        } while (reshowMenu);
        System.out.println("\n How much you are paying?\n" +
                "\n Please type the amount received: \n");
        double receivedAmount = scanner.nextDouble();
        myShoppingCart.calcChange(receivedAmount);
    }

}

