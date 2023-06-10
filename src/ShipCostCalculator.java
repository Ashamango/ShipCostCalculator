import java.util.Scanner; // before the class at top of the file
public class ShipCostCalculator { // class ShipCostCalculator
    public static void main(String[] args) { // main
        Scanner in = new Scanner(System.in);

        // Declare variables
        double shipping; // num shipping
        double totalCost; // num totalCost

        // Prompt and input
        System.out.print("Enter the price of the item:  "); // output "Enter the price of the item: "
        double price = in.nextDouble(); // num price

        if (price >= 100) // if price >= 100 then
        {
            shipping = 0; // shipping = 0
            totalCost = price + shipping; // totalCost = price + shipping
            in.nextLine();
            System.out.print("The shipping cost is " + shipping + " dollars and the total cost is " + totalCost + " dollars."); // output "The shipping cost is " + shipping + " dollars and the total cost is " + totalCost + " dollars."
        } else // else
        {
            shipping = 0.02 * price; // shipping = 0.02 * price
            totalCost = shipping + price; // totalCost = shipping + price
            in.nextLine();
            System.out.print("The shipping cost is " + shipping + " dollars and the total cost is " + totalCost + " dollars."); // output "The shipping cost is " + shipping + " dollars and the total cost is " + totalCost + " dollars."
        } // endif
    } // return
} // end class