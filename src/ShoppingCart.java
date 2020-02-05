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
        return totalCost;
    }

    public ArrayList getShoppingCartItems(){
        for(Product products:shoppingCart){
            System.out.println(products.getProductName());
        }
        return shoppingCart;
    }

//A TotalCost getter:
    public double getTotalCost(){
        System.out.println("\nThe total price is: "+ this.totalCost + "\n");
        return totalCost;

    }

//A function to calculate the discount, with if statements to confirm the type of discount:
    public double calculateDiscount(){
        System.out.println("\n Your total cost before discount is: "+ totalCost);

        if(totalCost>= 10 & totalCost < 20){
            totalCost -= 0.5;
            System.out.println("Your order is more than 10 EUR, so you get 0.5 EUR discount!");
        }else if(totalCost >=20){
            totalCost -= 1.0;
            System.out.println("Your order is more than 20 EUR, so you get 1.0 EUR discount!");
        }
        return totalCost;
    }

//A function to calculate the change:
    public double calcChange(double payment){
        this.change = payment - totalCost;
        System.out.println("We have received: "+payment+" EUR, and your change is: "+change);
        return change;
    }

}
