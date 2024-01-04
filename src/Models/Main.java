package Models;
import Models.Book;
import Models.T_shirt;

public class Main {
    public static void main(String[] args) {
        //object t-shirt created with the code Classname(T_shirt) variable(t-shirt) = new Classname tab
        T_shirt tShirt1 = new T_shirt("Gorkhali Batman\n", "You either die a hero or live long enough to see yourself be a villain", 572, "Karuna", 1235, new String[]{"XL", "Medium", "Large"});
        // Filled the itemname and description with values given form question

        // The same step above but for the ordering customer Gopal
        Book order1 = new Book("Gopal Sharma", "04-86756465", new String[]{"572", "681"}, new double[]{1235.0, 1780.0});


        System.out.println(tShirt1.describeTShirt());
        order1.printBill();
    }
}