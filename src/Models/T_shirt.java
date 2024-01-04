package Models;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class T_shirt {
    String itemName;
    String description;
    int productCode;
    String brand;
    double price;
    String[] sizes; //various size tei bhara array use []

    // Constructor set using class name ani variable declared this.name is constructor part
    public T_shirt(String itemName, String description, int productCode, String brand, double price, String[] sizes) {
        this.itemName = itemName;
        this.description = description;
        this.productCode = productCode;
        this.brand = brand;
        this.price = price;
        this.sizes = sizes;
    }

    // Getters and setters generate ani autofill
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    // Basic description by string in quotation ani values name without quotation
    public String describeTShirt() {
        return "Item name: " + itemName + "\nDescription: " + description + "\nProduct code: " + productCode +
                "\nBrand: " + brand + "\nPrice: " + price + "\nSizes: " + Arrays.toString(sizes);
    }
}