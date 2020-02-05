import java.util.ArrayList;

public class ShoppingCart{
    double totalCost;
    double change;

//Declaring a new ArrayList of Product type (i.e. an ArrayList of objects):
    ArrayList<Product> shoppingCart = new ArrayList<Product>();


//A function to add Product instances to the ArrayList:
    public double addProduct(Product newProduct){
        shoppingCart.add(newProduct);
        totalCost += newProduct.getProductPrice();
        System.out.println("The "+ newProduct.getProductName()+" was added to your cart, and your total cost is: "+ totalCost);
        return totalCost;
    }

    public ArrayList getShoppingCartItems(){
        System.out.println("\n      Those are your items: \n");
        for(Product products:shoppingCart){
            System.out.println("    >> "+products.getProductName());
        }
        return shoppingCart;
    }

//A TotalCost getter:
    public double getTotalCost(){
        System.out.println("\n      The total price is: "+ this.totalCost + "\n");
        return totalCost;

    }

//A function to calculate the discount, with if statements to confirm the type of discount:
    public double calculateDiscount(){
        System.out.println("\n      Your total cost before discount is: "+ totalCost);

        if(totalCost>= 10 & totalCost < 20){
            totalCost -= 0.5;
            System.out.println("\n      Your order is more than 10 EUR, so you get 0.5 EUR discount!\n");
        }else if(totalCost >=20){
            totalCost -= 1.0;
            System.out.println("\n      Your order is more than 20 EUR, so you get 1.0 EUR discount!\n");
        }
        return totalCost;
    }

//A function to calculate the change:
    public double calcChange(double payment){
        this.change = payment - totalCost;
        System.out.println("We have received: "+payment+" EUR, and your change is: "+change);
        System.out.println("\n" +
                "               ______                                      ____                                          \n" +
                "`````|`````  .~      ~.  `````|`````        `````````:' | |            |..          |             ..'''' \n" +
                "     |      |          |      |                   ..'   | |______      |  ``..      |          .''       \n" +
                "     |      |          |      |               ..''      | |            |      ``..  |       ..'          \n" +
                "     |       `.______.'       |             .:,,,,,,,,, | |___________ |          ``| ....''             \n" +
                "                                                                                                         \n");
        return change;
    }

}
