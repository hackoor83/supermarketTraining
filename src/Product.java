//A POJO of Product just showing two fields and getters:

public class Product {

    private String productName;
    private double productPrice;

//The Product constructor:
    public Product(String productName, double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }


    public double getProductPrice() {
        return productPrice;
    }

}
