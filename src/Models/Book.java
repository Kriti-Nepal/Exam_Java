package Models;
import java.util.Arrays;
//declare variable with data type
public class Book {
    String name;
    String phoneNumber;
    String[] items;
    double[] prices;

    //Constructor made by declaring the datatype of variable and using this. to set the constructor
    public Book(String name, String phoneNumber, String[] items, double[] prices) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.prices = prices;
    }

    // Getters and setters generated automatically using generate getter and setter and right clicking all the options
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    // Bill callculation: the initial value of total is set to be 0. The vat is 13% so 13/100= 0.13 set gareko. total + vat le final sum
    public void printBill() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        double vat = total * 0.13;
        double totalPrice = total + vat;

        System.out.println("\nJuju Tees pvt ltd. \nBILL:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phoneNumber);
        //sout int double error new method array to string used methof os javautilarray converts array to string and gave our output
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("\nTotal: " + total);
        System.out.println("VAT (13%): " + vat);
        System.out.println("With a discount of 13%, Total Price of your order is: \n" + totalPrice + "\nThank you for supporting our business \n -Ram");
    }
}