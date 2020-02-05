import java.util.ArrayList;

public class ShoppingCart{
    double totalCost;
    double change;
    ArrayList<String> shoppingCart = new ArrayList<String>();

    public double addProduct(String productName, double productPrice){
        shoppingCart.add(productName);
        totalCost += productPrice;

        return totalCost;
    }

    public ArrayList getShoppingCartItems(){
        for(String products:shoppingCart){
            System.out.println(products);
        }
        return shoppingCart;
    }

    public double getTotalCost(){
        System.out.println("\nThe total price is: "+ this.totalCost + "\n");
        return totalCost;

    }

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

    public double calcChange(double payment){
        this.change = payment - totalCost;
        System.out.println("We have received: "+payment+" EUR, and your change is: "+change);
        return change;
    }

}
