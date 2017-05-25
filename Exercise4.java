import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Xyxon on 5/25/2017.
 */
public class Exercise4 {

    public static void main(String[] args) {
        int orderno, orderpieces;
        Grocery grocery = new Grocery();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            do {
                System.out.println("--------------------------------------");
                System.out.println("Welcome to " + grocery.getName());
                String[] items = grocery.getItems();
                Integer[] price = grocery.getPrice();
                for (int x = 0; x < items.length; x++) {
                    System.out.print((x + 1) + " = " + items[x] + " - " + price[x] + "\n");
                }
                System.out.println("0 = Cashout");
                System.out.println("--------------------------------------");


                System.out.print("Choose number on the Menu: ");
                orderno = scanner.nextInt();
                if (orderno > 0 && orderno < items.length) {
                    System.out.print("How many pieces of " + items[orderno - 1] + ": ");
                    orderpieces = scanner.nextInt();
                    if (orderpieces > 0) {
                        int indexOrderno = orderno - 1;

                        //Add order name
                        grocery.addOrder(items[indexOrderno]);

                        //Add order pieces
                        grocery.addPieces(orderpieces);

                        //Add price in total
                        grocery.addTotal(price[indexOrderno] * orderpieces);
                    }
                }
            }
            while (orderno != 0);

            List<String> items = grocery.getOrder();
            List<Integer> pieces = grocery.getPieces();
            if (items.size() > 0) {
                Integer[] price = grocery.getPrice();
                for (int x = 0; x < items.size(); x++) {
                    System.out.println(items.get(x) + " X " + pieces.get(x) + " = " + (price[x] * pieces.get(x)));
                }
                System.out.println("Total: " + grocery.getTotal());
                int cash = 0;
                while(cash<grocery.getTotal()) {
                    System.out.print("Enter cash: ");
                    cash = scanner.nextInt();
                    if (cash >= grocery.getTotal()) {
                        grocery.setCash(cash);
                        System.out.println("Change: " + grocery.getChange());
                    }
                    else{
                        System.out.println("Your cash is enough to pay your order. Please enter cash with more than or equal to total of your order.");
                    }
                }
            }
            System.out.println("Please press any number to continue...");
            scanner.nextInt();
        }
    }
}
